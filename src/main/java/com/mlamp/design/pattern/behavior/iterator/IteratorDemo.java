package com.mlamp.design.pattern.behavior.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection collection = new MyCollections();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
