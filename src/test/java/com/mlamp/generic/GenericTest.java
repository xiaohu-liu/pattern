package com.mlamp.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    @Test
    public void genericTest() {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        System.out.println(classStringArrayList);
        Class classIntegerArrayList = integerArrayList.getClass();
        System.out.println(classIntegerArrayList);
        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("equal");
        }
    }

    @Test
    public void genericClazzTest2() {
        Generic<String> generic = new Generic<>("hello");
        Generic<Integer> generic_int = new Generic<>(23);
        System.out.println(generic_int.getKey().getClass());
        Generic generic_boolean = new Generic(false);
        System.out.println(generic_boolean.getKey().getClass());
        Generic<Object> generic_string = new Generic(232);
        System.out.println(generic_string.getKey().getClass());
    }

    @Test
    public void genericTest3() {
        Generic<Integer> gInteger = new Generic<Integer>(132);
        Generic<Number> gNumber = new Generic<Number>(232);
        showKeyValue2(gNumber);
        showKeyValue2(gInteger);


    }

    /**
     * 同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。
     *
     * @param obj
     */
    private void showKeyValue1(Generic<Number> obj) {
        System.out.println(obj.getKey());
    }

    /**
     * 类型通配符一般是使用？代替具体的类型实参
     * 此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类
     *
     * @param obj
     */
    private void showKeyValue2(Generic<?> obj) {
        System.out.println(obj.getKey());
        System.out.println(obj.getKey().getClass());
    }
}
