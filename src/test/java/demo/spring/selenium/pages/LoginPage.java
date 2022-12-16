//package demo.spring.selenium.pages;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginPage {
//    WebDriver driver;
//
//    @BeforeEach
//    public void prepareBrowser() {
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//    }
//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
//
//    @Test
//    void testLogin(){
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("m.dummy.i0");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Honda2020!");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
//
//        String getData = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/div[4]/button")).getText();
//        Assert.assertTrue(getData.contains("Cek Pusat Bantuan"));
//    }
//
//    @Test
//    void testSearching() throws InterruptedException {
//
//        testLogin();
//
//
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/input")).sendKeys("scp002");
//        driver.findElement(By.xpath("/html/body/div[2]/ul/li[14]/ul/li[1]/ul/li[1]/a")).click();
//        Thread.sleep(10000);
//        //WebElement loading = driver.findElement(By.xpath("//*[@id=\"AHMFASCP002_P01_FilterTransferDateStart\"]"));
//        //WebDriverWait wait = new WebDriverWait(driver, 10);
//        //wait.until(ExpectedConditions.invisibilityOf(loading));
//        driver.findElement(By.xpath("//*[@id=\"AHMFASCP002_P01_FilterTransferDateStart\"]")).sendKeys("01-Sep-2022");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/button[1]")).click();
//        String getData = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[1]")).getText();
//        Assert.assertTrue(getData.contains("OCT-22"));
//
//    }
//}
