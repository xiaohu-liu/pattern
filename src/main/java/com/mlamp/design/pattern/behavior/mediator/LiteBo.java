package com.mlamp.design.pattern.behavior.mediator;

public class LiteBo extends User {

    private Mediator mediator;

    public LiteBo(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void work() {
        System.out.println("lite bo work");
    }
}
