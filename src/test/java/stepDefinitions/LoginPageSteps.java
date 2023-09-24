package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import base.TestSetUp;
import org.testng.Assert;
 
public class LoginPageSteps {
 
    TestSetUp setUp;
    //public PageObjectManager pageObjectManager;
    public LoginPage loginPage;
    public HomePage homePage;
 
 
    public LoginPageSteps(TestSetUp setUp) {
        this.setUp = setUp;
        this.loginPage = new LoginPage(setUp.driver);
        this.homePage= new HomePage(setUp.driver);
    }
 
    @Given("User is on Home page")
    public void loginTest() {
        setUp.driver.get("https://opensource-demo.orangehrmlive.com/");
 
    }
 
    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
 
        // login to application
        loginPage.login(userName, passWord);
 
        // go the next page
 
    }
 
    @Then("User should be able to login successfully")
    public void verifyLogin() {
 
        // Verify home page
        Assert.assertTrue(homePage.getHomePageText().contains("Dashboard"));
 
    }
 
    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
 
        // Verify home page
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage);
 
    }
 
}