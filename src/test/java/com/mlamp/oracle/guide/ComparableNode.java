package com.mlamp.oracle.guide;

public class ComparableNode<T extends Comparable<T>> {
    private T data;
    private ComparableNode<T> next;

    public ComparableNode(T data, ComparableNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }
}
