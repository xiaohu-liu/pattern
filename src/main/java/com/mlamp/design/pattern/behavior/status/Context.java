package com.mlamp.design.pattern.behavior.status;

public class Context {
    private Status status;

    public Context(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void method() {
       if (status.getValue().equalsIgnoreCase("red")){
           System.out.println("WARNING...");
       } else if (status.getValue().equalsIgnoreCase("green")){
           System.out.println("INFO");
       }
    }
}
