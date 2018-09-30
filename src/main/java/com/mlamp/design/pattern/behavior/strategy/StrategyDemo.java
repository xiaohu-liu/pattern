package com.mlamp.design.pattern.behavior.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        String exp = "2+8";
        Icalculator icalculator = new Plus();
        int result = icalculator.calculate(exp);
        System.out.println(exp + " =" + result);
    }
}
