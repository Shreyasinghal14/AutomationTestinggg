package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

	public WebDriver driver;
	public final static int TIMEOUT = 10;

	public WebDriver WebDriverManager() {

		if (driver == null) {
			/*
			 * WebDriverManager.chromedriver().clearDriverCache().setup();
			 * WebDriverManager.chromedriver().clearResolutionCache().setup();
			 */
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox","--disable-extensions","--start-maximized","--disable-notifications");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			//driver.manage().window().maximize();
			// driver.get(url);

		}
		return driver;
	}
}