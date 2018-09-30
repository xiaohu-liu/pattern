package com.mlamp.oracle.guide;

public class SingleNode<T> {
    private T data;
    public SingleNode(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
