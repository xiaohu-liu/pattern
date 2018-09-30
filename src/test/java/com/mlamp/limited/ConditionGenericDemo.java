package com.mlamp.limited;

import org.junit.Test;

import java.util.Map;

public class ConditionGenericDemo {

    @Test
    public void test1() {
        ConditionGeneric result = ConditionGeneric.min(new ConditionGeneric("232"),
                new ConditionGeneric("3434343"));
        System.out.println(result);


        ConditionGeneric maxValue = ConditionGeneric.max(new ConditionGeneric("2332"), new ConditionGeneric("23233232"));
        System.out.println(maxValue);

        Map<ConditionGeneric, Hook> convertResult = ConditionGeneric.convert(new ConditionGeneric("2323"), (new Hook() {
            private String userName;

            @Override
            public void execute() {

            }

            public Hook userName(String userName) {
                this.userName = userName;
                return this;
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "userName='" + userName + '\'' +
                        '}';
            }
        }).userName("liuxiaohu"));

        for (ConditionGeneric conditionGeneric : convertResult.keySet()) {
            System.out.println(conditionGeneric.toString());
            System.out.println(convertResult.get(conditionGeneric));
        }
    }
}
