package com.mlamp.design.pattern.creation.factory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.sender();
        sender = factory.produce("mail");
        sender.sender();
        sender = factory.produce("other");
        sender.sender();
    }
}
