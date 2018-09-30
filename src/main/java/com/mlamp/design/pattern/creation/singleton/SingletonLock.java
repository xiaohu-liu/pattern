package com.mlamp.design.pattern.creation.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonLock {
    private static volatile SingletonLock instance = null;
    private static Lock lock = new ReentrantLock();

    private SingletonLock() {

    }

    public static SingletonLock getInstance() {
        try {
            lock.lock();
            if (instance == null) {
                instance = new SingletonLock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return instance;
    }

    public static SingletonLock getInstance2() {
        try {

            if (instance == null) {
                lock.lock();
                if (instance == null) {
                    instance = new SingletonLock();
                }
                lock.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

}
