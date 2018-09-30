package com.mlamp.design.pattern.struct.adapter;

public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void call() {
        source.call();
    }

    @Override
    public void exec() {
        System.out.println("Inside Wrapper::exec() method");
    }
}
