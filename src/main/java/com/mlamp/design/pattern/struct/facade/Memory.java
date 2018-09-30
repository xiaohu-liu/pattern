package com.mlamp.design.pattern.struct.facade;

public class Memory implements Flow {
    @Override
    public void start() {
        System.out.println("Memory::start()");
    }

    @Override
    public void shutdown() {
        System.out.println("Memory::shutdown()");
    }
}
