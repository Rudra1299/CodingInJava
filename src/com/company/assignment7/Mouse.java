package com.company.assignment7;

public class Mouse extends Rodent{

    public Mouse() {
        super();
        System.out.println("Mouse in the rodent class");
    }
    @Override
    public void eat() {
        System.out.println("I eat gradually");
    }

    @Override
    public void run() {
        System.out.println("I run in between");
    }

    @Override
    public void dig() {
        System.out.println("I dig faster");
    }
}
