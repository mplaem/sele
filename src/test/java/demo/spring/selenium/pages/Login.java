/*
package demo.spring.selenium.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    WebDriver driver;

    @BeforeEach
    public void prepareBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    void test(){
        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");

        String getData = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/center/div")).getText();
        Assert.assertTrue(getData.contains("PT Astra Honda Motor"));

        String getDatax = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).getText();
        Assert.assertTrue(getDatax.equals("LOGIN"));
    }
}
*/
