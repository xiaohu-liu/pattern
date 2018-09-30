package com.mlamp.design.pattern.struct.decorate;

public class Decorator implements  Sourceable {

    private Source source;

    public Decorator(Source source){
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
        System.out.println("Decorator method");
    }
}
