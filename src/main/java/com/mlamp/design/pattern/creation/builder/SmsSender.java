package com.mlamp.design.pattern.creation.builder;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("Inside SmsSender::send() method");
    }
}
