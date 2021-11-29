package com.company.assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFilenameFiler implements FilenameFilter {

    private String initialsRegx;
    private Pattern pattern;
    public MyFilenameFiler(String initialsRegx) {
        this.initialsRegx = initialsRegx;
         pattern = Pattern.compile(initialsRegx);

    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }

}
