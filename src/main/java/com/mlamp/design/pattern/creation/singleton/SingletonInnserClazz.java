package com.mlamp.design.pattern.creation.singleton;

public class SingletonInnserClazz {

    /**
     * private construct to void instance creation
     */
    private SingletonInnserClazz() {
    }

    /**
     * use the static inner class to keep the instance
     */
    private static class SingletonInnserClazzFactory {
        private static SingletonInnserClazz instance = new SingletonInnserClazz();
    }

    /**
     * get the instance
     *
     * @return
     */
    public static SingletonInnserClazz getInstance() {
        return SingletonInnserClazzFactory.instance;
    }

    /**
     * if the object was serialized ,the function keep the consist before the action and after it
     *
     * @return
     */
    public Object readResolve() {
        return getInstance();
    }
}
