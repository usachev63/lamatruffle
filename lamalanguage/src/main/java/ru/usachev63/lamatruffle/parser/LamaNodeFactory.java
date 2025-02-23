package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.strings.TruffleString;
import org.antlr.v4.runtime.Token;
import ru.usachev63.lamatruffle.LamaLanguage;
import ru.usachev63.lamatruffle.nodes.Const;
import ru.usachev63.lamatruffle.nodes.LamaRootNode;

public class LamaNodeFactory {
    public LamaNodeFactory(LamaLanguage language) {
        this.language = language;
    }

    public LamaRootNode getMain() {return main;}

    public void createMain(Const body) {
        this.main = new LamaRootNode(language, new FrameDescriptor(), body, null, TruffleString.fromJavaStringUncached("main", TruffleString.Encoding.UTF_8));
    }

    public Const createConst(Token literalToken) {
        try {
            return new Const(Long.parseLong(literalToken.getText()));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private final LamaLanguage language;
    private LamaRootNode main;
}
