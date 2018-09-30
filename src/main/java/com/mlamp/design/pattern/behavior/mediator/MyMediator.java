package com.mlamp.design.pattern.behavior.mediator;

public class MyMediator implements Mediator {

    private User liteMing;
    private User liteBo;

    @Override
    public void createMediator() {
        liteBo = new LiteBo(this);
        liteMing = new LiteMing(this);
    }

    public User getLiteMing() {
        return liteMing;
    }

    public void setLiteMing(User liteMing) {
        this.liteMing = liteMing;
    }

    public User getLiteBo() {
        return liteBo;
    }

    public void setLiteBo(User liteBo) {
        this.liteBo = liteBo;
    }

    @Override
    public void workAll() {
        liteMing.work();
        liteBo.work();
    }
}
