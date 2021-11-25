package com.company.assignment6;

public class OrganisationMain {
    public static void main(String[] args) {
        String name = "someOrgName";
        Organisation org = new Organisation(name);
        Member mem1 = new Member("a1", "1", "regular");
        Member mem2 = new Member("b2", "2", "regular");
        org.addMember(mem1);
        org.addMember(mem2);
    }
}
