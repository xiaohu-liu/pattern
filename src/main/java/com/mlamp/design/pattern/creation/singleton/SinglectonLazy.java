package com.mlamp.design.pattern.creation.singleton;

public class SinglectonLazy {
    private static SinglectonLazy instance = new SinglectonLazy();

    /**
     * it's the lazy model.
     *
     * @return
     */
    public static SinglectonLazy getInstance() {
        return instance;
    }
}
