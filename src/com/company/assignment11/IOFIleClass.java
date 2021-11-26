package com.company.assignment11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IOFIleClass {
    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();
        System.out.print("Enter the file path to count characters: ");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        try(FileReader fin = new FileReader(filePath)) {
            int i;
            while((i = fin.read()) != -1) {
                char ch = (char) i;
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            for(char ch : charCount.keySet()) {
                System.out.println(ch + " : " + charCount.get(ch));
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
