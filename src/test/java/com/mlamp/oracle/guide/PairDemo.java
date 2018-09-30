package com.mlamp.oracle.guide;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("age", 23);
        Pair<String, String> p2 = new OrderedPair<>("username", "spdier");
    }
}
