package com.syntax.class03.HW03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxProject {
    public static void main(String[] args) throws InterruptedException {

        /*
        Task
        Navigate to http://syntaxprojects.com
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        Thread.sleep(1000);

        WebElement practicing=driver.findElement(By.xpath("//a[contains(@id, 'btn_basic_example')]"));
        practicing.click();
        Thread.sleep(1000);

        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Simple Form Demo' and @class='list-group-item']"));
        simpleFormDemo.click();
        Thread.sleep(1000);

        WebElement enterText=driver.findElement(By.xpath("//input[contains(@placeholder, 'Please')]"));
        enterText.sendKeys("Hello_World");
        Thread.sleep(500);

        WebElement showMessage=driver.findElement(By.xpath("//button[contains(@onclick, 'showInput')]"));
        showMessage.click();

        driver.quit();



    }
}
