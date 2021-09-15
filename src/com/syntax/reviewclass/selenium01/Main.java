package com.syntax.reviewclass.selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https:www.facebook.com");

       WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
       createAccount.click();


            Thread.sleep(500);


        WebElement firstName=driver.findElement(By.name("firstname"));
       firstName.sendKeys("Nailya");

       WebElement lastName=driver.findElement(By.name("lastname"));
       lastName.sendKeys("Talgat");

        WebElement Email=driver.findElement(By.name("reg_email__"));
        Email.sendKeys("macnailyat@gmail.com");

        Thread.sleep(500);

       WebElement renterEmail=driver.findElement(By.name("reg_email_confirmation__"));
       renterEmail.sendKeys("macnailyat@gmail.com");

       WebElement password=driver.findElement(By.id("password_step_input"));
       password.sendKeys("123nailya");

        Thread.sleep(500);

       WebElement Signup=driver.findElement(By.name("websubmit"));
       password.click();

        Thread.sleep(500);

       WebElement closePage=driver.findElement(By.id("u_2_9_H4"));
       closePage.click();

    }
}
