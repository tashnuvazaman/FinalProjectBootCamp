package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegisterButtonTest extends CommonAPI {

@Test
public void clickByXpath() {
    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[3]")).click();
}
}




