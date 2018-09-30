package com.mlamp.design.pattern.struct.bridge;

public class SourceSub1 implements  Sourceable {
    @Override
    public void method() {
        System.out.println("SourceSub1 method()");
    }
}
