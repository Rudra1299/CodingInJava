package com.company.assignment7.InnerClasses;

public class WebBrowser {
    String name;
    public WebBrowser(String name) {
        this.name = name;
        System.out.println("This is a " + name + " web browser");
    }

    public static class ContentWeb extends Website.Content{
        public ContentWeb(String image, String position) {
            super(image, position);
        }

        public void webBroswerfaeture() {
            System.out.println("This is executing web browser features");
        }
    }


}
