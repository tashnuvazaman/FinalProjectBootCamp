import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TargetTesting {
    public WebDriver driver;


    @Test
    public void bedBath() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasnu\\IdeaProjects\\web-automation-framework\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.id("search")).sendKeys("towel");
WebElement webElement = driver.findElement(By.id("search"));
webElement.sendKeys(Keys.ENTER);
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[4]/div[2]/div/div[2]/div[3]/div[2]/ul/li[1]/div/div[1]/h3/div/a/div[2]/div/div/picture/img")).click();
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[4]/div/div[2]/div[3]/div[1]/div/div[1]/div/div[1]/div[2]/button")).click();
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div[20]/div/div/div/div/div/div/div[3]/div[3]/button")).click();





       // driver.close();


    }




   // @After
    //public void after () {
        //driver.quit();
    }








