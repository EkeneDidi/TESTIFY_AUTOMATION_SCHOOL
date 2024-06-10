package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Task16 {
    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

        //Add implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

        System.out.println("---Start browser---");
    }

    @Test
    public void launchWebsite() throws InterruptedException {
        //Navigate to the url
        driver.get("https://testifyltd.com/");

        Thread.sleep(3000);

        System.out.println("---Launch website---");
    }

    @Test
    public void scrollToFooter() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        Thread.sleep(3000);

        System.out.println("---Scroll to footer---");
    }

    @Test
    public void hardAssert () {
        String email = "info@testifyltd.co.uk";
        Assert.assertEquals(email, "info@testifyltd.co.uk");

        System.out.println("Email is accurate");

    }

    @Test
    public void hardAssert2 () {
        String Location = "Nigeria";
        Assert.assertEquals(Location, "Nigeria");

        System.out.println("---Location is accurate---");
    }

    @Test
    public void softAssert () {
        String num = "(+234)905-882-0971";
        SoftAssert phoneNum = new SoftAssert();
        phoneNum.assertEquals(num, "(+234)904-882-0971" );

        System.out.println("---Phone Number is accurate---");
        phoneNum.assertAll();
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
        System.out.println("Close browser");
    }
}