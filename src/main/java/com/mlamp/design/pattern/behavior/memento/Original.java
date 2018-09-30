package com.mlamp.design.pattern.behavior.memento;

public class Original {
    private String status;

    public Original(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento createMemento() {
        return new Memento(status);
    }

    public void restoreMemento(Memento memento) {
        this.status = memento.getStatus();
    }
}
