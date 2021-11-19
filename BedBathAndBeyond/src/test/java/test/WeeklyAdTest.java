package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WeeklyAdTest extends CommonAPI {

    @Test
    public void clickOnCss() {
        driver.findElement(By.cssSelector("#utilityNav-weeklyAd")).click();
    }
}
