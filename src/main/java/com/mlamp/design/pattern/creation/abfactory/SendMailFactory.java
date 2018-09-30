package com.mlamp.design.pattern.creation.abfactory;

public class SendMailFactory implements  Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
