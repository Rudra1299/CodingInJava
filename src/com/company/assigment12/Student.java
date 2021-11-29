package com.company.assigment12;

import java.lang.ref.SoftReference;

//Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate
public class Student {

    Integer id;
    String name;
    Integer age;
    String gender;
    String engDepartment;


    Integer yearOfEnrollment;
    double perTillDate;

    public Student(Integer id, String name, Integer age, String gender, String engDepartment,
                   Integer yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public String getGender() {
        return gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public Integer getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    @Override
    public String toString() {
        return "" + id + " " + name + " " + age + " " + gender + " " + engDepartment +  " " + yearOfEnrollment +
                " " + perTillDate;
    }
}
