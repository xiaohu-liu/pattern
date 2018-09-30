package com.mlamp.design.pattern.struct.proxy;

public class Source implements  Sourceable {
    @Override
    public void method() {
        System.out.println("Inside Source::method()");
    }
}
