import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BedBathTesting {
    public WebDriver driver;


    @Test
    public void bedBath() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasnu\\IdeaProjects\\web-automation-framework\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bedbathandbeyond.com/");
        driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"searchlabel\"]/div[2]")).click();
driver.findElement(By.id("searchInput")).sendKeys("towel");
driver.findElement(By.xpath("//*[@id=\"mainSearch\"]/button")).click();




       // driver.close();


    }




   // @After
    //public void after () {
        //driver.quit();
    }








