package ru.usachev63.lamatruffle.parser;

public abstract class Ref {

    public final Ref origin; // null means that this is the original ref
    public final Frame frame;
    public final Scope scope;

    protected Ref(Ref origin, Frame frame, Scope scope) {
        this.origin = origin;
        this.frame = frame;
        this.scope = scope;
    }

    public static final class LocalVarRef extends Ref {
        public final int frameSlot;

        public static LocalVarRef createOriginal(Frame frame, Scope scope, int frameSlot) {
            return new LocalVarRef(frame, scope, frameSlot);
        }

        private LocalVarRef(Frame frame, Scope scope, int frameSlot) {
            super(null, frame, scope);
            this.frameSlot = frameSlot;
        }
    }

    public static final class GlobalRef extends Ref {
        public final String name;

        public static GlobalRef createOriginal(Frame globalFrame, String name) {
            return new GlobalRef(globalFrame, name);
        }

        private GlobalRef(Frame frame, String name) {
            super(null, frame, frame.topScope);
            this.name = name;
        }
    };

    public static final class ClosureRef extends Ref {
        public final int capturedVarIndex;

        public static ClosureRef createLowered(Ref origin, Frame frame, int capturedVarIndex) {
            return new ClosureRef(origin, frame, capturedVarIndex);
        }

        private ClosureRef(Ref origin, Frame frame, int capturedVarIndex) {
            super(origin, frame, frame.topScope);
            this.capturedVarIndex = capturedVarIndex;
        }
    };

    public static final class FunctionRef extends Ref {
        public final Frame targetFrame;

        public static FunctionRef createOriginal(Frame contextFrame, Scope contextScope, Frame targetFrame) {
            targetFrame.referencedIn.add(new Frame.ReferencePoint(contextFrame, contextScope));
            return new FunctionRef(null, contextFrame, contextScope, targetFrame);
        }

        public static FunctionRef createLowered(Frame contextFrame, FunctionRef ref) {
            ref.targetFrame.referencedIn.add(new Frame.ReferencePoint(contextFrame, contextFrame.topScope));
            return new FunctionRef(ref.origin, contextFrame, contextFrame.topScope, ref.targetFrame);
        }

        private FunctionRef(Ref origin, Frame frame, Scope scope, Frame targetFrame) {
            super(origin, frame, scope);
            this.targetFrame = targetFrame;
        }
    }
}
