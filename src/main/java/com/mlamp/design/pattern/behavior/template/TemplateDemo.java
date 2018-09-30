package com.mlamp.design.pattern.behavior.template;

public class TemplateDemo {
    public static void main(String[] args) {
        AbstractCalculate calculate = new Plus();
        String exp = "2+4";
        int calculates = calculate.calculates(exp, "\\+");
        System.out.println(calculates);
        exp = "20-8";
        calculate = new Minus();
        calculates = calculate.calculates(exp, "\\-");
        System.out.println(calculates);
    }
}
