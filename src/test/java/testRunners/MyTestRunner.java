package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread",
				"rerun:target/failuretxt.txt"},
		features={"src\\test\\resources\\com\\features"},
		glue={"stepDefination","applicationHooks"},
		//tags= "@StoreDashboard",
		monochrome = true
		)

public class MyTestRunner {

}
