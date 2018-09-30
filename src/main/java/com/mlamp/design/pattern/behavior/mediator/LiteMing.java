package com.mlamp.design.pattern.behavior.mediator;

public class LiteMing extends User {

    private Mediator mediator;
    public LiteMing(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    void work() {
        System.out.println("lite ming work...");
    }
}
