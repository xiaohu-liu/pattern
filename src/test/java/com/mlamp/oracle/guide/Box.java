package com.mlamp.oracle.guide;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public <T extends Number> void inspect2(T u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());

    }


    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(new Integer(10));
        integerBox.inspect(new Integer(10));
        System.out.println("##############");
        integerBox.inspect2(new Integer(200));
        //integerBox.inspect("some next");
        integerBox.inspect(new Long(10));
        integerBox.inspect2(new Float(20.0f));
    }
}
