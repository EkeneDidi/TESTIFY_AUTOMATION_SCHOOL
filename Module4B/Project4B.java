package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Project4B {

    WebDriver driver = null;


    @BeforeClass
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");

        //Launch browser
        driver = new ChromeDriver();

        //To Maximize the browser
        driver.manage().window().maximize();

    }

    @Test
    public void sectionA() {

        //navigate to the url
        driver.get("https://www.automationexercise.com/");
        //sign up as a new user by creating an account
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        WebElement nameTextbox = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        WebElement emailTextbox = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        WebElement createaccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));


        //Generate random data using faker
        Faker faker = new Faker();
        String name = faker.name().name();
        String email = faker.internet().emailAddress();

        //Feeding data to application for signup
        nameTextbox.sendKeys(name);
        emailTextbox.sendKeys(email);
        createaccount.click();

        //Filling in fields on the Account Information page.
        driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
        driver.findElement(By.id("password")).sendKeys("Beautiful");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");

        //Select DOB dropdown
        WebElement day = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));

        Select select = new Select(day);
        select.selectByVisibleText("10");

        Select select1 = new Select(month);
        select1.selectByVisibleText("April");

        Select select2 = new Select(year);
        select2.selectByVisibleText("2000");

        //Tick the newsletter and special offer radio button
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
        driver.findElement(By.id("first_name")).sendKeys("Ada");
        driver.findElement(By.id("last_name")).sendKeys("Edward");
        driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("ABC Holdings");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("32 Osborne Road");
        driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Herbert Estate");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");

        WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select countryDropdown = new Select(country);
        countryDropdown.selectByVisibleText("United States");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Alberta");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("London");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("65400");
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("456787654490");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();



        //   Validating that account was created successfully
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));
        String actualMessage = successMessage.getText();
        String expectedMessage = "Congratulations! Your new account has been successfully created!";
        successMessage.isDisplayed();
        Assert.assertEquals(expectedMessage, actualMessage);

        //Continue button
        driver.findElement(By.cssSelector("#form > div > div > div > div > a")).click();



        // products section of the site to purchase  top of your choice from the women's section
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();


        // Validating that the item was added successfully to cart
        WebElement addedSuccessfully = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]"));
        String actual = successMessage.getText();
        String expected = "Your product has been added to cart.";

        addedSuccessfully.isDisplayed();
        Assert.assertEquals(expected, actual);


        //proceed to checkout

        driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();

        JavascriptExecutor sj = (JavascriptExecutor) driver;
        sj.executeScript("window.scrollBy(0,3000)");
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("I love the top");
        driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();

        //Filling payment details
        driver.findElement(By.name("name_on_card")).sendKeys("//*[@id=\"payment-form\"]/div[1]/div/input");
        driver.findElement(By.name("card_number")).sendKeys("4567876567");
        driver.findElement(By.name("cvc")).sendKeys("325");
        driver.findElement(By.name("expiry_month")).sendKeys("07");
        driver.findElement(By.name("expiry_year")).sendKeys("2030");
        driver.findElement(By.id("submit")).click();

        System.out.println("Congratulations! Your order has been confirmed!");
    }
}