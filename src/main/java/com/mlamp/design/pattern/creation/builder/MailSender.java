package com.mlamp.design.pattern.creation.builder;

public class MailSender implements  Sender {
    @Override
    public void send() {
        System.out.println("mail send() method");
    }
}
