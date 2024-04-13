package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Task7 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html. ");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"header_main\"]/table/tbody/tr/td[4]/span/a/span[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"q_search\"]")).sendKeys("Lagos");
        Thread.sleep(5000);
        driver.findElement(By.xpath(" //*[@id=\"searchForm\"]/input[3]")).click();
        //Monday 08April To 12th April
        String ThisweekWeatherForecast = driver.findElement(By.xpath("//div[@class='col-7 city_right_side']")).getText();
        //Temperature for 8th to 12th April

        System.out.println(ThisweekWeatherForecast);



    }

}
