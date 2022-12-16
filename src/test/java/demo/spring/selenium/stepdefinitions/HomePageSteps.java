package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps {

 //   private HomePage homePage = new HomePage(Hooks.driver);

    @Autowired
    private HomePage homePage;

    @Given("I Open PASTI")
    public void iOpenLoginPage(){
        homePage.verifyFooterText();
    }

    @When("I fill in {string} as username")
    public void iFillInAsUsername(String username) {
        homePage.insertUser(username);
    }

    @Then("I Fill in {string} as password")
    public void iFillInAsPassword(String password) {
        homePage.insertPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        homePage.LoginButton();
    }

//    @And("I should see {string} text")
//    public void iShouldSeeText(String inputAnnouncements){
//        homePage.announcement(inputAnnouncements);
//    }

//   @Then("I Fill in {string} as password")
//   public void iFillInAsPassword(String password) {
//       homePage.insertPassword(password);
//   }
//
//    @And("I should see {string} text")
//    public void iShoudSeeText(String inputAnnouncements){
//        homePage.announcement(inputAnnouncements);
//    }
}
