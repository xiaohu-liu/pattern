package com.mlamp.design.pattern.behavior.iterator;

public interface Iterator {
    Object next();

    boolean hasNext();

    int size();

    Object previous();

}
