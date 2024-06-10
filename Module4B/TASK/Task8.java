package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);
       boolean state = driver.findElement(By.xpath("//*[@id=\"create\"]")).isEnabled();
       driver.findElement(By.id("firstName")).sendKeys("Didii");
       driver.findElement(By.id("lastName")).sendKeys("Nworah");
       driver.findElement(By.id("email")).sendKeys("FTGJVHCRYTGH");
        driver.findElement(By.cssSelector("#female")).click();
        driver.findElement(By.id("password")).sendKeys("bvghvcfdrtgf");
        driver.findElement(By.id("confirmPass")).sendKeys("bvghvcfdrogf");
        driver.findElement(By.id("xpLevel")).sendKeys("I am great");
        boolean check = driver.findElement(By.xpath("//*[@id=\"create\"]")).isEnabled();

        System.out.println(state);
        System.out.println(check);
    }
}
