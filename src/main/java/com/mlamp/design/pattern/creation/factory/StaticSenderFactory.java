package com.mlamp.design.pattern.creation.factory;

public class StaticSenderFactory {
    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }
}
