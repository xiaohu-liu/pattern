package com.mlamp.design.pattern.behavior.interpretor;

public class Context {
    private int one;
    private int anotherOne;

    public Context(int one, int anotherOne) {
        this.one = one;
        this.anotherOne = anotherOne;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getAnotherOne() {
        return anotherOne;
    }

    public void setAnotherOne(int anotherOne) {
        this.anotherOne = anotherOne;
    }
}
