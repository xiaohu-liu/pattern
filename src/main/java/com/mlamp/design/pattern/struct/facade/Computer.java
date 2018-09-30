package com.mlamp.design.pattern.struct.facade;

public class Computer implements Flow {

    private CPU cpu;
    private Memory memory;
    private Disk disk;


    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }


    @Override
    public void start() {
        System.out.println("starting the computer...");
        cpu.start();
        memory.start();
        disk.start();
        System.out.println("compute started");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the computer...");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
