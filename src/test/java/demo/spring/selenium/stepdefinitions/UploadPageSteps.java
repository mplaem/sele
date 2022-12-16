package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.UploadPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UploadPageSteps {

    @Given ("I Open Upload Page")
    public void iOpenLoginPage(){
        UploadPage.verifyFooterText();
    }

    @Then("I Click Browse")
    public void iClickBrowse() {
        UploadPage.clickUpload();
    }

    @And("I Click Upload")
    public void iClickUpload() {
    }
}
