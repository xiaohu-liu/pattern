package com.mlamp.design.pattern.behavior.visitor;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
