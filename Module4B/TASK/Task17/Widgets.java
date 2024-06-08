package org.example.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Widgets {

    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Add implicit wait

        driver.get(" https://demoqa.com ");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        Thread.sleep(5000);

    }

    @Test
    public void demoWidgets() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]")).click();

        String widget = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[4]/span/div/div[1]")).getText();

        Thread.sleep(3000);

        SoftAssert assertWidgets = new SoftAssert();

        assertWidgets.assertEquals(widget, "Widget");

        System.out.println("This is the Widgets page");

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}