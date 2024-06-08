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

public class Elements {

    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://demoqa.com ");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        Thread.sleep(5000);

    }

    @Test
    public void demoElements() throws InterruptedException {
        WebElement elementTile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));

        elementTile.click();

      WebElement elementHeader = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]"));
      String elementsPage = elementHeader.getText();

        Thread.sleep(3000);

        SoftAssert assertElements = new SoftAssert();

        assertElements.assertEquals(elementsPage, "Elements");

        System.out.println("This is the Elements page ");

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


}