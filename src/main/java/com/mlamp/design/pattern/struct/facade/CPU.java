package com.mlamp.design.pattern.struct.facade;

public class CPU implements Flow {
    @Override
    public void start() {
        System.out.println("CPU::start");
    }

    @Override
    public void shutdown() {
        System.out.println("CPU::shutdown()");
    }
}
