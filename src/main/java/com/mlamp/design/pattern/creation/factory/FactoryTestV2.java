package com.mlamp.design.pattern.creation.factory;

public class FactoryTestV2 {
    public static void main(String[] args) {
        SenderFactoryV2 senderFactoryV2 = new SenderFactoryV2();
        senderFactoryV2.produceMailSend().sender();
        senderFactoryV2.produceSmsSender().sender();
    }
}
