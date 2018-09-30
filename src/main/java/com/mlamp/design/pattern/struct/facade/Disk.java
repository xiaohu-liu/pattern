package com.mlamp.design.pattern.struct.facade;

public class Disk implements Flow {
    @Override
    public void start() {
        System.out.println("Disk::start()");
    }

    @Override
    public void shutdown() {
        System.out.println("Disk::shutdown()");
    }
}
