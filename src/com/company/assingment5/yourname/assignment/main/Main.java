package com.company.assingment5.yourname.assignment.main;

import com.company.assingment5.yourname.assignment.data.Person;
import com.company.assingment5.yourname.assignment.singleton.Person1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.printVariables();

        Person1 person1 = new Person1();
        person1.printName();

    }
}
