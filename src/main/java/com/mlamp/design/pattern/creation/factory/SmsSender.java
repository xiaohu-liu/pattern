package com.mlamp.design.pattern.creation.factory;

public class SmsSender implements  Sender {
    @Override
    public void sender() {
        System.out.println("Inside SmsSender::send() method");
    }
}
