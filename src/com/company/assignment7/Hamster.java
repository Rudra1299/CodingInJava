package com.company.assignment7;

public class Hamster extends Rodent{

    public Hamster() {
        super();
        System.out.println("Hamster in Rodent class");
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
