package test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
        import java.util.List;
        import java.util.concurrent.TimeUnit;

public class AmazonTestingP {
    public WebDriver driver;


    @Test
    public void amazon() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\barua\\IdeaProjects\\web-automation-framework-team4\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.className("s-image")).click();
//       Select dropdown = new Select( driver.findElement(By.className("a-icon a-icon-popover")));
//       dropdown.selectByVisibleText("");





        // driver.close();


    }




//    @After
//    public void after () {
//        driver.quit();
//    }
}
