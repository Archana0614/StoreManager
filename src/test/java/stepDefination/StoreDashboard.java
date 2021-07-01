package stepDefination;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.StoreDashboardPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreDashboard {
	private StoreDashboardPage storeDashboardPage= new StoreDashboardPage(DriverFactory.getDriver());
	


	@Given("user on store dashboard")
	public void user_on_store_dashboard() {
	 storeDashboardPage.selectStore();
     String Actual=storeDashboardPage.pageTitle();
     System.out.println(Actual);

	}

	@When("user get the option")
	public void user_get_the(DataTable dataTable) {
		System.out.println(storeDashboardPage.isDisplayed());
		Assert.assertTrue(storeDashboardPage.isDisplayed());
	}

	@Then("user clicks on {string} link")
	public void verify_for_link(String option) {
		storeDashboardPage.clickOn(option);
		
	}


}
