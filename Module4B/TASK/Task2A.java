package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2A {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://getreliancehealth.com/nigeria/");
    }
}
