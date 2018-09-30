package com.mlamp.design.pattern.creation.factory;

public class SenderFactoryV2 {
    public Sender produceMailSend() {
        return new MailSender();
    }

    public Sender produceSmsSender() {
        return new SmsSender();
    }
}
