package com.mlamp.limited;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ConditionGeneric implements Comparable<ConditionGeneric>, Serializable {

    private String value;

    public ConditionGeneric(String value) {
        this.value = value;
    }

    @Override
    public boolean compare(ConditionGeneric i) {
        if (value.length() > i.value.length()) {
            return true;
        }
        return false;
    }

    public static <T extends Comparable> T min(T... a) {
        T smallest = a[0];
        for (T t : a) {
            if (smallest.compare(t)) {
                smallest = t;
            }
        }
        return smallest;
    }

    public static <T extends Comparable & Serializable> T max(T... a) {
        T maxValue = a[0];
        for (T t : a) {
            if (!maxValue.compare(t)) {
                maxValue = t;
            }
        }
        return maxValue;
    }

    public static <T extends Comparable & Serializable, U extends Hook> Map<T, U> convert(T a, U b) {
        Map<T, U> map = new HashMap<>();
        map.put(a, b);
        return map;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConditionGeneric{" +
                "value='" + value + '\'' +
                '}';
    }
}

