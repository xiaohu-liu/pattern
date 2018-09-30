package com.mlamp.oracle.guide;

public class Singleton {
    public static void main(String[] args) {
        Node1<Circle> nc = new Node1<>();
        Node1<? extends Shape> ns = nc;
        System.out.println(ns);
    }
}

class Shape { /* ... */ }

class Circle extends Shape { /* ... */ }

class Rectangle extends Shape { /* ... */ }

class Node1<T> {}


