package testRunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"json:target/positive/cucumber.json", "pretty",
				"html:target/positive/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread",
				"rerun:target/failuretxt.txt"},
				
		features={"src\\test\\resources\\com\\features"},
		glue={"stepDefination","applicationHooks"},
		//tags= "@StoreDashboard",
		monochrome = true
		)

public class SerenityRunner {

}
