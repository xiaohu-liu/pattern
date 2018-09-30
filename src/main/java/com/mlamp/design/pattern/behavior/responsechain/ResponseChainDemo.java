package com.mlamp.design.pattern.behavior.responsechain;

public class ResponseChainDemo {
    public static void main(String[] args) {
        MyHandler m1 = new MyHandler("handler1");
        MyHandler m2 = new MyHandler("handler2");
        MyHandler m3 = new MyHandler("handler3");
        m1.setHandler(m2);
        m2.setHandler(m3);
        m1.operator();
    }
}
