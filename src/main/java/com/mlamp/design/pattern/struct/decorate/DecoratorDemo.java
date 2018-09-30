package com.mlamp.design.pattern.struct.decorate;

public class DecoratorDemo {
    public static void main(String[] args) {
        Source source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}
