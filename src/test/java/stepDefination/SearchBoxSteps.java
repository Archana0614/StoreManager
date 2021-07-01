package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


import com.factory.DriverFactory;
import com.pages.IndexPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBoxSteps {

	private IndexPage indexPage= new IndexPage(DriverFactory.getDriver());
	private String searchWord;
	
	@Given("user on store manager page {string} link")
	public void user_on_store_manager_page_link(String websiteURL) {
	   DriverFactory.getDriver().get(websiteURL);
	}

	@When("user enter the credentail for login by Username as {string} and Password as {string}")
	public void user_enter_the_credentail_for_login_by_username_as_and_password_as(String username, String pwd) {
	    indexPage.logintoB2C(username, pwd);
	}

	@When("user selected {string} option")
	public void user_selected_option(String retailer) {
		indexPage.selectRetailer(retailer);
	
	}

	@When("user click on search box and enter {string} keyword")
	public void user_click_on_search_box_and_enter_keyword(String searchKeyWord) {
	   indexPage.enterSearchKeyword(searchKeyWord);
	   searchWord=searchKeyWord;
	}

	@Then("validate the outcomes is as per search result")
	public void validate_the_outcomes_is_as_per_search_result() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		List<WebElement> result = indexPage.listofSearchitem();
		
		if (result != null) {
			for (WebElement webElement : result) {
				System.out.println(webElement.getText());
				String Actual = webElement.getText().toLowerCase();
				String Expected = searchWord.toLowerCase();
			Assert.assertTrue(Actual.contains(Expected));
			Assert.fail();
	}

		}
}
}