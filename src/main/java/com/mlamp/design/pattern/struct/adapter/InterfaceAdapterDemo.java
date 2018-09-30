package com.mlamp.design.pattern.struct.adapter;

public class InterfaceAdapterDemo {
    public static void main(String[] args) {
        Wrapper2 sub1 = new Wrapper2Sub1();
        sub1.call();

        sub1 = new Wrapper2Sub2();
        sub1.exec();
    }
}
