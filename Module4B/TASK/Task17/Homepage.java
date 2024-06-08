package org.example.Task17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homepage {
    public class Elements {

        WebDriver driver = null;


        @Test
        public void openBrowser() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(" https://demoqa.com ");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");

            Thread.sleep(5000);
            System.out.println("This is Task 17 Homepage");
        }
    }
}
