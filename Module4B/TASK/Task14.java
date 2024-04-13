package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


    //Navigate to the url
        driver.get("https://www.toolsqa.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();
        Thread.sleep(3000);
        System.out.println("No dialog box seen");

}
}
