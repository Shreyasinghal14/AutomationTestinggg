package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import pageObjects.PageObjectManager;
 
public class TestSetUp {
 
	/*
	 * public WebElement errorMessage; public WebElement homePageUserName; //public
	 * PageObjectManager pageObjectManager;
	 */    public WebDriver driver;
    public BaseTest baseTest;
 
    public TestSetUp()  {
 
        baseTest = new BaseTest();
        driver = baseTest.WebDriverManager();
 
    }
}