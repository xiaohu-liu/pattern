package com.mlamp.design.pattern.struct.proxy;

public class Proxy implements Sourceable {


    private Source source;

    public Proxy() {
        this.source = new Source();
    }


    @Override
    public void method() {
        source.method();
    }
}
