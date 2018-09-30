package com.mlamp.design.pattern.behavior.iterator;

public interface Collection {
    public Iterator iterator();

    public Object get(int index);

    public int size();
}
