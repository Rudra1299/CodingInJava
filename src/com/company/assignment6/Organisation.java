package com.company.assignment6;

public class Organisation {
    String name;
    Member[] members;
    int i  = 0;
    public Organisation(String name) {
        this.name = name;
        System.out.println("The name of Organisation: " + this.name);
        members = new Member[100];
    }

    public void addMember(Member member) {
        members[i] = member;
    }

}
