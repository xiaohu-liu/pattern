package com.mlamp.design.pattern.behavior.visitor;

public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        func1();
        System.out.println("visit the subject " + subject.getSubject());
    }

    public void func1() {
        System.out.println("func1");
    }
}
