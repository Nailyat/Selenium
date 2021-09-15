package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver(); // launch Chrome browser
        webDriver.get("https://www.google.com/");
        String url = webDriver.getCurrentUrl();
        System.out.println(url); // shows link in output
        String title = webDriver.getTitle();
        System.out.println(title); // shows the name of site in output
        webDriver.quit();



    }
}
