package ru.usachev63.lamatruffle.parser;

import ru.usachev63.lamatruffle.nodes.expr.ExprNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    public final Scope outer;
    public final List<ExprNode> prolog = new ArrayList<>();
    public final Map<String, Ref> originalVariables = new HashMap<>();

    public Scope(Scope outer) {
        this.outer = outer;
    }
}
