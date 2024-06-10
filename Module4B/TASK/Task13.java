package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[1]/div[1]")). click();

        driver.findElement(By.name("q")).sendKeys("Demo dropdown");

        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]")).click();

        Thread.sleep(3000);

    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.xpath("//a[normalize-space()='Read more']")).click();

    WebElement country = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));

    Select selectCountry = new Select(country);

        selectCountry.selectByValue("NG");

        Thread.sleep(3000);

    WebElement month = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));

    Select selectMonth = new Select(month);

        selectMonth.selectByValue("Jan");

        Thread.sleep(3000);

        selectMonth.selectByIndex(2);

        Thread.sleep(3000);

        selectMonth.selectByVisibleText("March");



}
}
