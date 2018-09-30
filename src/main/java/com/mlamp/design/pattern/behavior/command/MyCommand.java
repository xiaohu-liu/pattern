package com.mlamp.design.pattern.behavior.command;

public class MyCommand implements Command {
    Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
