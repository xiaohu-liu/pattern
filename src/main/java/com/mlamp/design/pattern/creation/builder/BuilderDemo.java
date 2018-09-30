package com.mlamp.design.pattern.creation.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Build build = new Build();
        build.build(100);
        build.sends();
    }
}
