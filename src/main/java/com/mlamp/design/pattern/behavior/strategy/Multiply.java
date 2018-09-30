package com.mlamp.design.pattern.behavior.strategy;

public class Multiply extends AbstractCalculator implements Icalculator {
    @Override
    public int calculate(String expression) {
        int[] arrayInts = split(expression, "\\*");
        return arrayInts[0] * arrayInts[1];
    }
}
