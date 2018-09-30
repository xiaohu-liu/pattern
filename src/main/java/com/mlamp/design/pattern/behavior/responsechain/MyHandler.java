package com.mlamp.design.pattern.behavior.responsechain;

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name  + " deal!");
        if (handler != null){
            handler.operator();
        }
    }
}
