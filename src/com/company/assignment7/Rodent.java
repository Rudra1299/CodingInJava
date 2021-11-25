package com.company.assignment7;

public abstract class Rodent {
    String name = "Rodent";
    public Rodent() {
        System.out.println("This is a Rodent");
    }
    public abstract void eat();
    public abstract void run();

    public void setName(String name) {
        this.name = name;
    }

    public abstract void dig();


}
