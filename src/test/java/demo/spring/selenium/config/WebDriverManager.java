package demo.spring.selenium.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class WebDriverManager {
    @Value("${browser}")
    private String browser;

   // final String DOCKER_HOST = "https://96fe-202-165-38-66.ap.ngrok.io";

    final String DOCKER_HOST = "http://10.0.110.71:4444";
    String remote = String.format("%s/wd/hub", DOCKER_HOST);
    @Bean
    @Scope("cucumber-glue")
    public WebDriver webDriverFactory() throws MalformedURLException {
//   //     io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
//        if (browser.equalsIgnoreCase("chrome")) {
//            return new ChromeDriver();
//        }
//        else if (browser.equalsIgnoreCase("firefox")){
//            return new FirefoxDriver();
//        }
//        else {
//            return new EdgeDriver();
//        }
//        //return null;
//        // return new FirefoxDriver();
//    }

        if (browser.equalsIgnoreCase("chrome")) {
                    return new RemoteWebDriver(new URL(remote), new ChromeOptions());
        }
        else if (browser.equalsIgnoreCase("firefox")){
                    return new RemoteWebDriver(new URL(remote), new FirefoxOptions());
        }
        else {
                    return new RemoteWebDriver(new URL(remote), new EdgeOptions());
        }
        //return null;
        // return new FirefoxDriver();
    }
}

