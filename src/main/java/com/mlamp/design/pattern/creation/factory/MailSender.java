package com.mlamp.design.pattern.creation.factory;

public class MailSender implements  Sender {
    @Override
    public void sender() {
        System.out.println("Inside MailSender::send() method");
    }
}
