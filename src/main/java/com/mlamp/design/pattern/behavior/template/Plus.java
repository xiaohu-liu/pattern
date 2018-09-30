package com.mlamp.design.pattern.behavior.template;

public class Plus extends AbstractCalculate {
    @Override
    public int calculates(int one, int another) {
        return one + another;
    }
}
