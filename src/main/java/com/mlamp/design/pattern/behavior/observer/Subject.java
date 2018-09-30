package com.mlamp.design.pattern.behavior.observer;

public interface Subject {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObservers();
    public void operation();
}
