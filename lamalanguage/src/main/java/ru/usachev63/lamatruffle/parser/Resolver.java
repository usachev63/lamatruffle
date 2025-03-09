package ru.usachev63.lamatruffle.parser;

import ru.usachev63.lamatruffle.nodes.UnresolvedRefNode;

import java.util.ArrayList;
import java.util.List;

public class Resolver {

    void addResolveRequest(UnresolvedRefNode node, Frame frame, Scope scope) {
        requests.add(new ResolveRequest(node, frame, scope));
    }

    void resolveAll() {}

    private record ResolveRequest(UnresolvedRefNode node, Frame frame, Scope scope) {}
    private final List<ResolveRequest> requests = new ArrayList<>();

    private void resolveOne(String name, Frame frame, Scope scope) {
//        var varNameTruffleStr = TruffleString.fromJavaStringUncached(name, TruffleString.Encoding.US_ASCII);
//        Ref origin = null;
//        var frameStack = new ArrayList<Frame>();
//        Frame originFrame = frame;
//        Scope originScope = scope;
//        while (originFrame != null) {
//            frameStack.add(originFrame);
//            Ref ref = originScope.find(varNameTruffleStr);
//            if (ref != null) {
//                origin = ref;
//                break;
//            }
//            originScope = originFrame.parentScope;
//            originFrame = originFrame.parent;
//        }
//        if (originFrame == null)
//            return new GlobalRef(name);
//        if (originFrame == frame)
//            return origin;
//        Collections.reverse(frameStack);
//        Ref current = origin;
//        for (int i = 0; i < frameStack.size() - 1; ++i) {
//            var parentFrame = frameStack.get(i);
//            var currentFrame = frameStack.get(i + 1);
//            current = currentFrame.capture(
//                name,
//                current,
//                parentFrame
//            );
//        }
//        return current;
    }
}
