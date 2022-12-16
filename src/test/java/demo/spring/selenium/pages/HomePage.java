package demo.spring.selenium.pages;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Component
@Scope("cucumber-glue")

public class HomePage {
    @FindBy(xpath ="/html/body/div[1]/div[3]/div/center/div")
    WebElement footer;
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement fieldUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement fieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[2]/form/div[4]/button")
    WebElement buttonLogin;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/h3")
    WebElement textAnnouncements;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void verifyFooterText(){
        Assertions.assertTrue(footer.getText().contains("PT Astra Honda Motor"));
    }

    public void insertUser(String username){
        fieldUsername.sendKeys(username);
    }

    public void insertPassword(String password){fieldPassword.sendKeys(password);
    }
    public void LoginButton(){buttonLogin.click();
    }

    public void announcement(String inputAnnouncements){
        String getData = textAnnouncements.getText();
        Assertions.assertTrue(getData.equals(inputAnnouncements));
    }
}
