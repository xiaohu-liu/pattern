package com.mlamp.design.pattern.struct.adapter;

public class Adapter extends Source implements  Targetable {
    @Override
    public void exec() {
        System.out.println("Inner Adapter::exec() method");
    }
}
