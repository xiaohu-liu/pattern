package com.mlamp.design.pattern.creation.abfactory;

public class SendSmsFactory implements  Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
