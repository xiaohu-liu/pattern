package com.mlamp.design.pattern.behavior.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Original original =new Original("green");
        Storage storage = new Storage(original.createMemento());
        System.out.println("init status " + original.getStatus());
        original.setStatus("red");
        System.out.println("init status " + original.getStatus());
        original.restoreMemento(storage.getMemento());
        System.out.println("init status " + original.getStatus());
    }
}
