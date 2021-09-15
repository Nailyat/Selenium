package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/"); //browser opens first Facebook -->
        driver.navigate().to("https://www.google.com/"); // then Google in the same tab -->
        driver.navigate().back(); // and back to Facebook
        driver.navigate().forward(); // jump to Google back;
        Thread.sleep(2000); // makes pause for 2 sec before refresh -->
        driver.navigate().refresh(); // refresh the last page
        driver.close(); // close the current tab
        driver.quit(); // close all tabs and quit from the browser

    }
}
