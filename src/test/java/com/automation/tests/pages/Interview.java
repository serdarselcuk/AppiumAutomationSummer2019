package com.automation.tests.pages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

    public static void main(String[] args) {
        String name = "Serdar";
        String result ="";
        for (int i = name.length()-1; i <= 0; i--) {
            result += ""+name.charAt(i);
        }
        System.out.println(result);
    }
}