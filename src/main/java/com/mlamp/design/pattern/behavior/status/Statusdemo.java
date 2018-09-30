package com.mlamp.design.pattern.behavior.status;

public class Statusdemo {
    public static void main(String[] args) {
        Status status = new Status("red");
        Context context = new Context(status);
        context.method();
        status.setValue("green");
        context.method();
    }
}
