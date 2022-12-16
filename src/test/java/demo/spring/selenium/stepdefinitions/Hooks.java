package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.SpringContextConfiguration;
import demo.spring.selenium.config.ConfigProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks
{

    @Autowired
    private WebDriver driver;

    @Autowired
    private ConfigProperties properties;

    @Before
    public void openBrowser() {
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
    }


    @After
    public void tearDown(Scenario scenario){

        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        driver.quit();
    }

//    @Test
//    void test(){
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//
//        String getData = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/center/div")).getText();
//        Assertions.assertTrue(getData.contains("PT Astra Honda Motor"));
//
//    }

}
