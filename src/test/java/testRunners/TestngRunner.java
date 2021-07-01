package testRunners;


import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


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

public class TestngRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
