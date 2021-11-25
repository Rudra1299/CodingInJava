package com.company.assignment8;

import java.util.ArrayList;
import java.util.List;

public class ExceptionApp {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>(List.of("www.google.com", "www.gmail.com"));
        List<String> usernames = new ArrayList<>(List.of("Luke", "sierra"));
        List<String> passwords = new ArrayList<>(List.of("5789", "97900"));
        List<String> files = null;
        String url = "www.some.com";
        String username = "emily";
        String password = "89790";
        try {
            if (!urls.contains(url)) {
                throw new InvalidURLException("This url does not exist");
            }
            if (!usernames.contains(username)) {
                throw new WrongUserNameException("This username does not exists");
            }
            if(!passwords.contains(password)) {
                throw new InvalidPasswordException("This is an invalid password");
            }

        }
        catch(Exception e) {
            if (e instanceof InvalidURLException) {
                System.out.println("InvalidURLException handler");
            }
            else if (e instanceof WrongUserNameException) {
                System.out.println("WrongUserNameException handler");
            }
            else {
                System.out.println("InvalidPasswordException handler");
            }
            //files.size();
        }
        finally {
            System.out.println("This block will be executed no matter what");
        }
    }
}
