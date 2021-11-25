package com.company.assignment7.UpDownCast;

public class Bicycle extends BalanceCycle{

    public Bicycle() {
        super();
        System.out.println("This is a bicycle");
        this.setName("bicycle");
        this.setWheetCount(2);
    }

    @Override
    public void drive() {
        System.out.println("You are driving a bicycle");
    }

    @Override
    public void balance() {
        System.out.println("You need to balance two wheels");
    }
}
