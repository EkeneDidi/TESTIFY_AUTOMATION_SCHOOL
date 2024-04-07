package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/ ");

        driver.findElement(By.cssSelector("input[data-test=\"username\"]")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#checkout")).click();

        //driver.quit();

    }
}
