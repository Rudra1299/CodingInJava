package com.company.assignment1;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directory: ");
        String dirPath = sc.nextLine();
        File file = new File(dirPath);

        System.out.print("Enter the pattern of the files: ");
        String filePattern = sc.nextLine();
        MyFilenameFiler myFilenameFiler = new MyFilenameFiler(filePattern);

        String[] flist = file.list(myFilenameFiler);

        if(flist == null) {
            System.out.println("Empty directory or directory does not exist");
        }
        else {
            for(String fileName: flist) {
                File file1 = new File(dirPath, fileName);
                System.out.println(file1.getAbsoluteFile());
            }
        }
    }
}
