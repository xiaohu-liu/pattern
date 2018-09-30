package com.mlamp.design.pattern.struct.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }
}
