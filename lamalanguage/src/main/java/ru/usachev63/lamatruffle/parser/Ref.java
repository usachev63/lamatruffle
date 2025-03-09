package ru.usachev63.lamatruffle.parser;

public abstract class Ref {
    public static final class LocalVarRef extends Ref {
        public final int frameSlot;

        public LocalVarRef(int frameSlot) {
            this.frameSlot = frameSlot;
        }
    }

    public static final class GlobalRef extends Ref {
        public final String name;

        public GlobalRef(String name) {
            this.name = name;
        }
    };

    public static final class ClosureRef extends Ref {
        public final int capturedVarIndex;

        public ClosureRef(int capturedVarIndex) {
            this.capturedVarIndex = capturedVarIndex;
        }
    };
}
