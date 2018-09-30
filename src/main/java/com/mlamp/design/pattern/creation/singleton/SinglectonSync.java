package com.mlamp.design.pattern.creation.singleton;

public class SinglectonSync {
    private static SinglectonSync instance = null;
    private static Object lock = new Object();

    private SinglectonSync() {
    }

    /**
     * none-thread-safe
     *
     * @return
     */
    public static synchronized SinglectonSync getInstanceV1() {
        if (instance == null) {
            instance = new SinglectonSync();
        }
        return instance;
    }


    /**
     * double-check is not sure the ultimate thread-safe
     * java jvm decouples the assignment and object creation
     * it is not sure that the pre order to create object then to assign
     * or pre order to assign then to create object
     *
     * @return
     */
    public static SinglectonSync getInstanceV2() {
        if (instance == null) {
            synchronized (SinglectonSync.class) {
                if (instance == null) {
                    instance = new SinglectonSync();
                }
            }
        }
        return instance;
    }

    public static SinglectonSync getInstanceV3() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SinglectonSync();
                }
            }
        }
        return instance;
    }

    public static SinglectonSync getInsanceV4() {
        if (instance == null) {
            initSync();
        }
        return instance;
    }

    private static synchronized void initSync() {
        if (instance == null) {
            instance = new SinglectonSync();
        }
    }
}
