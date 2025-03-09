package ru.usachev63.lamatruffle.parser;

import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;
import ru.usachev63.lamatruffle.nodes.expr.FunctionSpawnNode;
import ru.usachev63.lamatruffle.nodes.expr.numeric.LongLiteralNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Resolver {

    public void addResolveNameRequest(UnresolvedRefNode node, Frame frame, Scope scope) {
        resolveNameRequests.add(new ResolveNameRequest(node, frame, scope));
    }

    public void addResolveFunctionSpawnRequest(UnresolvedFunctionSpawnNode node, Frame targetFrame, Frame frame) {
        resolveFunctionSpawnRequests.add(new ResolveFunctionSpawnRequest(node, frame, targetFrame));
    }

    public void resolveAll() {
        var resolvedRefs = new ArrayList<NodeAndResolveRef>();
        for (var request : resolveNameRequests) {
            Ref originalRef = resolveName(request.node.lident, request.frame, request.scope);
            Ref refHere = resolveRef(originalRef, request.frame);
            resolvedRefs.add(new NodeAndResolveRef(request.node, refHere));
        }
        while (!resolveWorkList.isEmpty()) {
            var item = resolveWorkList.removeLast();
            resolveRef(item.originalRef, item.frame);
        }
        for (var pair : resolvedRefs) {
            var newNode = makeNode(pair.resolvedRef);
            pair.node.replace(newNode);
        }
        for (var request : resolveFunctionSpawnRequests) {
            var newNode = makeNodeForFunction(request.contextFrame, request.targetFrame);
            request.node.replace(newNode);
        }
    }

    private record NodeAndResolveRef(UnresolvedRefNode node, Ref resolvedRef) {}

    private record ResolveNameRequest(UnresolvedRefNode node, Frame frame, Scope scope) {}
    private final List<ResolveNameRequest> resolveNameRequests = new ArrayList<>();

    private record ResolveFunctionSpawnRequest(UnresolvedFunctionSpawnNode node, Frame contextFrame, Frame targetFrame) {}
    private final List<ResolveFunctionSpawnRequest> resolveFunctionSpawnRequests = new ArrayList<>();

    // return original ref
    private Ref resolveName(String name, Frame frame, Scope scope) {
        Ref maybeHere = scope.originalVariables.get(name);
        if (maybeHere != null)
            return maybeHere;
        if (scope.outer != null)
            return resolveName(name, frame, scope.outer);
        return resolveName(name, frame.parent, frame.parentScope);
    }

    private record ResolveWorkListItem(Ref originalRef, Frame frame) {}
    private List<ResolveWorkListItem> resolveWorkList = new ArrayList<>();

    private void addToResolveWorkList(Ref originalRef, Frame frame) {
        resolveWorkList.add(new ResolveWorkListItem(originalRef, frame));
    }

    private Ref resolveRef(Ref originalRef, Frame frame) {
        if (originalRef instanceof Ref.GlobalRef)
            return originalRef;
        var maybeHere = frame.getCapturedOrOriginal(originalRef);
        if (maybeHere != null)
            return maybeHere;
        Ref parentRef = resolveRef(originalRef, frame.parent);
        Ref lowered = lower(parentRef, frame);
        frame.capturedRefs.put(originalRef, lowered);
        for (var referencePoint : frame.referencedIn)
            addToResolveWorkList(originalRef, referencePoint.contextFrame());
        return lowered;
    }

    private Ref lower(Ref parentRef, Frame frame) {
        if (parentRef instanceof Ref.FunctionRef)
            return lower((Ref.FunctionRef) parentRef, frame);
        return frame.capture(parentRef.origin);
    }

    private Ref lower(Ref.FunctionRef parentRef, Frame frame) {
        var loweredRef = Ref.FunctionRef.createLowered(frame, parentRef);
        for (var origin : parentRef.targetFrame.capturedRefs.keySet())
            addToResolveWorkList(origin, frame);
        return loweredRef;
    }

    private ExprNode makeNode(Ref ref) {
        if (ref instanceof Ref.GlobalRef globalRef)
            return new GlobalRefNode(globalRef.name);
        if (ref instanceof Ref.LocalVarRef localVarRef)
            return new LocalVarRefNode(localVarRef.frameSlot);
        if (ref instanceof Ref.ClosureRef closureRef) {
            return ElemRefNodeGen.create(
                ref.frame.closureContextReadNode,
                new LongLiteralNode(closureRef.capturedVarIndex)
            );
        }
        var functionRef = (Ref.FunctionRef) ref;
        return makeNodeForFunction(ref.frame, functionRef.targetFrame);
    }

    private ExprNode makeNodeForFunction(Frame contextFrame, Frame targetFrame) {
        if (!targetFrame.isClosure)
            return FunctionSpawnNode.createFunction(targetFrame.rootNode);
        ExprNode[] capturedVarNodes = new ExprNode[targetFrame.capturedVarsNum];
        for (var entry : targetFrame.capturedRefs.entrySet()) {
            var originalRef = entry.getKey();
            var capturedByTarget = entry.getValue();
            if (capturedByTarget instanceof Ref.FunctionRef)
                continue;
            assert capturedByTarget instanceof Ref.ClosureRef;
            var capturedVarIndex = ((Ref.ClosureRef) capturedByTarget).capturedVarIndex;
            var capturedByThis = contextFrame.getCapturedOrOriginal(originalRef);
            assert capturedByThis != null;
            capturedVarNodes[capturedVarIndex] = makeNode(capturedByThis);
        }
        return FunctionSpawnNode.createClosure(targetFrame.rootNode, capturedVarNodes);
    }
}
