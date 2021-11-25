package com.company.assignment7;

public class Gerbil extends Rodent{

    public Gerbil() {
        super();
        System.out.println("Gerbil in Rodent class");
    }
    @Override
    public void eat() {
        System.out.println("I eat faster");
    }

    @Override
    public void run() {
        System.out.println("I run slow");
    }

    @Override
    public void dig() {
        System.out.println("I dig in between");
    }
}
