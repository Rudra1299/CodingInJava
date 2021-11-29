package com.company.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("[A-Z].*\\.");
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()) {
            System.out.println("The sentence starts with Capital letters and ends with period.");
        }
        else {
            System.out.println("sentence does not start with Capital letters and ends with period");
        }
    }
}
