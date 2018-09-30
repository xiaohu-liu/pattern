package com.mlamp.generic;

import java.util.Random;

public class FruitGeneratorClazz implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(fruits.length)];
    }
}
