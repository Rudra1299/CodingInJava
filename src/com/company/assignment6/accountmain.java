package com.company.assignment6;

public class accountmain {
    public static void main(String[] args) {
        Account account = new Account(1, 2);
        Account accountNew = new Account(3, 5, "someName");
        System.out.println(account.toString());
        System.out.println(accountNew.toString());

    }
}
