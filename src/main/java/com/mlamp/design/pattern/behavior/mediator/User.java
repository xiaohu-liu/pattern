package com.mlamp.design.pattern.behavior.mediator;

public abstract  class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void work();
}
