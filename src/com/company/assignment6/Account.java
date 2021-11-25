package com.company.assignment6;

public class Account {
    Integer id;
    Integer type;
    String name = "default-name";

    public Account(Integer id, Integer type) {
        this.id = id;
        this.type = type;
    }

    //overloading constructor
    public Account(Integer id, Integer type, String name) {
        this(id, type);
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + this.id + " " + this.type + " " + this.name;
    }

}
