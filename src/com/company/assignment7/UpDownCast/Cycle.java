package com.company.assignment7.UpDownCast;

public class Cycle {

    private String name = "Cycle";
    private Integer wheelCount;

    public Cycle() {
        System.out.println("This is a cycle");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheetCount(Integer wheetCount) {
        this.wheelCount = wheetCount;
    }

    public void drive() {
        System.out.println("you are driving a cycle");
    }


}
