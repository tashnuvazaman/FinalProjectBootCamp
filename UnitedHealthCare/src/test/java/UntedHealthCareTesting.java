import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UntedHealthCareTesting {

    public WebDriver driver;


    @Test
<<<<<<< HEAD
    public void HomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasnu\\IdeaProjects\\web-automation-framework\\Generic\\drivers\\chromedriver.exe");
=======
    public void united() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zabin\\IdeaProjects\\web-automation-framework-team4\\Generic\\drivers\\chromedriver.exe");
>>>>>>> 325bf93978501d5be2cee25a28dfdd783117a2fa

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.uhc.com/");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[contains(text(),'Find your plan')]")).click();
       driver.findElement(By.id("search-desktop")).sendKeys("Insurance");
       driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Sign in or register for an account')]")).click();
       driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
        //driver.close();
    }
    //@After
    //public void after () {
     //   driver.quit();
    }



