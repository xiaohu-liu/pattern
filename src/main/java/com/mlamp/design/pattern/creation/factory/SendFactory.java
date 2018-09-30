package com.mlamp.design.pattern.creation.factory;

public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equalsIgnoreCase(type)) {
            return new MailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsSender();
        } else {
            System.out.println("invalid sender type");
            return null;
        }
    }
}
