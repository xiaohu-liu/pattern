package com.mlamp.design.pattern.creation.abfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        provider.produce().send();

        provider = new SendSmsFactory();
        provider.produce().send();
    }
}
