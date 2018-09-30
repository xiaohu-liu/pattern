package com.mlamp.design.pattern.struct.adapter;

public class ObjectAdapterDemo {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.call();
        wrapper.exec();
    }
}
