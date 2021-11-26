package com.company.assignment7.InnerClasses;

public class Website {
    String name;
    public Website(String name) {
        this.name = name;
        System.out.println("This website name is " + name);
    }

    public static class Content {
        String text;
        String position;
        Content(String text, String position) {
            this.text = text;
            this.position = position;
            System.out.println("The " + text + " is positioned " + position);
        }
    }

    public Class getContentClass() {
        return Content.class;
    }
}
