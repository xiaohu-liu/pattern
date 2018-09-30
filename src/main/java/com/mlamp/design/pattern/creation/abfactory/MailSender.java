package com.mlamp.design.pattern.creation.abfactory;

public class MailSender implements  Sender {
    @Override
    public void send() {
        System.out.println("Inside MailSender::send() method");
    }
}
