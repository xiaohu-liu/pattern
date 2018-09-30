package com.mlamp.oracle.guide;

import java.util.Arrays;
import java.util.List;

public class PairVDemo {
    public static void main(String[] args) {
        PairV<Integer, String> p1 = new PairV<>(1, "apple");
        PairV<Integer, String> p2 = new PairV<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        boolean same2 = Util.compare(p1, p2);
        System.out.println(same);
        System.out.println(same2);


        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Util.process(list);

        List<Double> d_list = Arrays.asList(1.0, 23.0, 23.2);
        double result =  Util.sumOfList(d_list);
        System.out.println(result);

        Util.printListV2(d_list);

    }
}
