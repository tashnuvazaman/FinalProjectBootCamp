package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RedCartButtonTest extends CommonAPI {

   @Test
    public void clickByXpath() {
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='viewport']/div[3]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
    }

}
