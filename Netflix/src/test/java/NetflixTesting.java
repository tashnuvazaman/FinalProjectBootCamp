import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NetflixTesting {
    public WebDriver driver;


    @Test
    public void netflix() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\russe\\IdeaProjects\\web-automation-framework-team4\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.netflix.com/");
        driver.manage().window().maximize();


    driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
    //driver.findElement(By.xpath("//select[@id='lang-switcher-header-select']")).click();
   // driver.findElement(By.xpath("//input[@id='id_email_hero_fuji']")).sendKeys("eva.abedin@gmail.com");
       // driver.close();
    driver.findElement(By.id("id_userLoginId")).sendKeys("eva.abedin@gmail.com");
    driver.findElement(By.id("id_password")).sendKeys("abcd");
    driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }




   // @After
    //public void after () {
        //driver.quit();
    }
//}





