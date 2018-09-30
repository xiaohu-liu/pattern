package com.mlamp.design.pattern.behavior.observer;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("MySubject operation()");
    }
}
