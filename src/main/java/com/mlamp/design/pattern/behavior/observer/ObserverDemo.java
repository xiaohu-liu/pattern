package com.mlamp.design.pattern.behavior.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        AbstractSubject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.notifyObservers();
        subject.operation();
    }
}
