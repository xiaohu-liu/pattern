package com.mlamp.design.pattern.behavior.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
