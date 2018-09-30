package com.mlamp.design.pattern.creation.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SinglectonSync.getInstanceV2();
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.hello();
    }
}
