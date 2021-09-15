package com.syntax.reviewclass.selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Site {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com");
        Thread.sleep(1000);

        driver.navigate().to("https:www.saucedemo.com");
        Thread.sleep(1000);
        driver.navigate().back();

        Thread.sleep(1000);
        driver.navigate().forward();

        String titleOfThePage = driver.getTitle();
        System.out.println("The title of the psge is "+titleOfThePage);
        String Url=driver.getCurrentUrl();
        System.out.println("The URL of the page is "+Url);

        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement Password=driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");

        WebElement Login=driver.findElement(By.id("login-button"));
        Login.click();

        WebElement Menu=driver.findElement(By.id("react-burger-menu-btn"));
        Menu.click();

        Thread.sleep(1000);

        WebElement about=driver.findElement(By.id("about_sidebar_link"));
        about.click();

        driver.navigate().back();

        Thread.sleep(1000);

        WebElement addToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement checkTheCart=driver.findElement(By.id("shopping_cart_container"));
        checkTheCart.click();



}}
