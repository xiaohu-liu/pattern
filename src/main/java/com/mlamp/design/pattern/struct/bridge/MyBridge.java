package com.mlamp.design.pattern.struct.bridge;

public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
