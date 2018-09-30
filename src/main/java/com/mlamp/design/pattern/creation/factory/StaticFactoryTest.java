package com.mlamp.design.pattern.creation.factory;

public class StaticFactoryTest {
    public static void main(String[] args) {
        StaticSenderFactory.produceMailSender().sender();
        StaticSenderFactory.produceSmsSender().sender();
    }
}
