package com.syntax.class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        /* Launch th browser
           Navigate to Amazon web site
           Print out the url and title in the console
           Close the browser
         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        String url= driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url+" "+title);
        driver.quit();
    }

}
