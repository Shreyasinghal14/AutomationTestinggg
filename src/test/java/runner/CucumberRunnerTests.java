package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "", features = "src/test/resources", 
glue = { "stepDefinitions", "hooks" },
plugin = {"pretty", "json: target/cucumber-json/cucumber.json"}
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}