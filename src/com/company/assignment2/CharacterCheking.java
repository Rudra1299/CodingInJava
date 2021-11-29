package com.company.assignment2;

import java.util.Scanner;

public class CharacterCheking {

    public static void main(String[] args) {
        boolean[] alphabets = new boolean[26];
        boolean containsAlphabets = true;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int index = 0;
        for(char ch : text.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
            }
            else if(ch >= 'A' && ch <= 'Z') {
                index = ch - 'A';
            }
            else{
                continue;

            }

            alphabets[index] = true;
        }

        for(int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] == false) {
                containsAlphabets = false;
            }
        }
        if(containsAlphabets) {
            System.out.println("contains all alphabets");
        }
        else {
            System.out.println("does not contain all alphabets");
        }

        //time complexity O(2n) ~ O(n)
        //space complexity O(n)
    }
}
