package com.mlamp.design.pattern.behavior.interpretor;

public class Plus implements  Expression {
    @Override
    public int interpret(Context context) {
        return context.getOne() + context.getAnotherOne();
    }
}
