package com.mlamp.design.pattern.creation.singleton;

public class Singlecton {

    private static Singlecton instance = null;

    private Singlecton() {

    }

    public static Singlecton getInstance() {
        if (instance == null) {
            instance = new Singlecton();
        }

        return instance;
    }
}
