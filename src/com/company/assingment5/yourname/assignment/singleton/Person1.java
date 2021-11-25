package com.company.assingment5.yourname.assignment.singleton;

public class Person1 {
    String name;

    public static void setName(String s) {
        //this.name = s;

        //return this;
    }

    public void printName() {
        System.out.println(name);
    }

    //Person.this' cannot be referenced from a static context
}
