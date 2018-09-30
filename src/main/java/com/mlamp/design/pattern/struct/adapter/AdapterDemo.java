package com.mlamp.design.pattern.struct.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.call();
        targetable.exec();
    }
}
