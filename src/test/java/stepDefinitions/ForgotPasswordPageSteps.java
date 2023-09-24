package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ForgotPasswordPage;
import pageObjects.LoginPage;
//import pageObjects.PageObjectManager;
import base.TestSetUp;
import org.testng.Assert;
 
public class ForgotPasswordPageSteps{
 
    TestSetUp setUp;
    //PageObjectManager pageObjectManager;
    public LoginPage loginPage;
    public  ForgotPasswordPage forgotPasswordPage;
 
    public ForgotPasswordPageSteps(TestSetUp setUp) {
        this.setUp = setUp;
        this.loginPage = new LoginPage(setUp.driver);
        this.forgotPasswordPage = new ForgotPasswordPage(setUp.driver);
    }
 
    @When("User clicks on Forgot your password? link")
    public void forgotPasswordLink() {
 
        loginPage.clickOnForgotPasswordLink();
 
    }
 
    @Then("User should be able to navigate to Reset Password page")
    public void verifyForgotPasswordPage() {
 
        Assert.assertEquals(forgotPasswordPage.getForgotPageText(),"Reset Password");
 
    }
 
    @Then("User clicks on Cancel button to go back to Login Page")
    public void verifyCancelBtn() {
 
        forgotPasswordPage.clickOnCancelBtn();
        Assert.assertEquals(loginPage.getLoginPageTitle(),"Login");
 
    }
 
    @Then("User clicks on Reset Password button and provide username as {string}")
    public void verifyResetPasswordBtn(String username) {
 
        forgotPasswordPage.TypeOnUsernameTextBox(username);
        forgotPasswordPage.clickOnRestPasswordBtn();
 
    }
 
    @Then("Verify the message {string}")
    public void verifyMessage(String message) {
 
        Assert.assertEquals(forgotPasswordPage.getRestMessage(),message);
 
    }
}