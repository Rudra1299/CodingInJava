package com.company.assignment7.UpDownCast;

public class Tricycle extends Cycle{

    public Tricycle() {
        super();
        System.out.println("This is a Tricyle");
        this.setName("tricyle");
        this.setWheetCount(3);
    }

    @Override
    public void drive() {
        System.out.println("You are riding a tricycle");
    }
}
