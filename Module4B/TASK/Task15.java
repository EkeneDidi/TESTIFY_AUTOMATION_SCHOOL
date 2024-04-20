package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Task15 {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Add implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

        System.out.println("Start browser");

    }

    @Test
    public void google() throws InterruptedException {

        //Navigate to the url
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("testify ltd");

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();

        driver.close(); //closes the browser

        System.out.println("Search Tesify on Google");
        Thread.sleep(3000);
    }

    @Test
    public void mcDonalds() throws InterruptedException {

        //Navigate to the url
        driver.get("https://www.mcdonalds.com/us/en-us.html");

        Thread.sleep(3000);

        System.out.println("Launch mcdonalds website");

        String colourCode = driver.findElement(By.xpath("//a[@id='button-ordernow']")).getCssValue("background-color");

        System.out.println(colourCode);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();

        System.out.println("Close browser");
    }


}
