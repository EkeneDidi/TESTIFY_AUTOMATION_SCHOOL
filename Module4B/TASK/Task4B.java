import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4B {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/reliancehmo/IdeaProjects/Selenium/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("Didi");
        driver.findElement(By.name("password")).sendKeys("Didi20");

    }
}