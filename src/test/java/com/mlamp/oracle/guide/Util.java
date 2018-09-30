package com.mlamp.oracle.guide;

import java.util.List;

public class Util {

    public static <K, V> boolean compare(PairV<K, V> p1, PairV<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int countGeneraterThan(T[] anArray, T elem) {
        int count = 0;
        for (T t : anArray) {
            if (t.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void process(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number number : list) {
            s += number.doubleValue();
        }
        return s;
    }

    public static void printList(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void printListV2(List<?> list) {
        for (Object o : list) {
            System.out.println(o);

        }
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T t : anArray) {
            if (elem.equals(t)) {
                ++cnt;
            }
        }
        return cnt;
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}
