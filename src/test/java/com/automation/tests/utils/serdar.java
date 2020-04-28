package com.automation.tests.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class serdar {

    @Test(dataProvider = "provide")
    public void test(Object[][] a){

        System.out.println("newsa");
        System.out.println(a);
    }


    @DataProvider(name = "provide")
    public Object[][] provide(){

        Object[][] kazim = {{12},{12}};

        return kazim;
    }
}
