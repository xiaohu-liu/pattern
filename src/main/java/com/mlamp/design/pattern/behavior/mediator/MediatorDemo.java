package com.mlamp.design.pattern.behavior.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();

    }
}
