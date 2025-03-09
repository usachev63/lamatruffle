package ru.usachev63.lamatruffle.parser;

import com.oracle.truffle.api.strings.TruffleString;
import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    public final Scope outer;
    public final List<ExprNode> prolog = new ArrayList<>();
    public final Map<String, Ref> variables = new HashMap<>();

    public Scope(Scope outer) {
        this.outer = outer;
    }

    public Ref find(String name) {
        var result = variables.get(name);
        if (result != null)
            return result;
        if (outer != null)
            return outer.find(name);
        return null;
    }
}
