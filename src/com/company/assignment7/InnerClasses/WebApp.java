package com.company.assignment7.InnerClasses;

public class WebApp {
    public static void main(String[] args) {
        Website website = new Website("www.somewebsite.com");
        Website.Content content = new Website.Content("This is a webiste content", "left");
        WebBrowser webBroser = new WebBrowser("somebrowser");
        WebBrowser.ContentWeb contentWeb = new WebBrowser.ContentWeb("image", "right");
    }
}
