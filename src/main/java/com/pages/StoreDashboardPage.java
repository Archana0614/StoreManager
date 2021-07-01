package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StoreDashboardPage {

	private WebDriver driver;
	private Boolean check;

	// By locators of storeDashboard page

	private By store_name = By.xpath("//span[@class='store-name']");
	private By storeHours = By.xpath("//span[contains(text(),' Store Hours')]");
	private By storeDetails = By.xpath("//span[contains(text(),' Store Details')]");
	private By smartScreen = By.xpath("//span[contains(text(),' Smart Screen Information')]");
	private By listOfEle = By.xpath("//li[@class=' align-items-center d-flex justify-content-between']");

	// Constructor
	public StoreDashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	// Page actions of storedashboard page

	public void selectStore() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(store_name).click();
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public boolean isDisplayed() {
		List<WebElement> ele1 = driver.findElements(listOfEle);
		boolean status = false;
		for (WebElement webElement : ele1) {
			status = webElement.isDisplayed();
		}
		return status;
	}

	public void clickOn(String option) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		if (option.contains("Store Hours")) {

			driver.findElement(storeHours).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			driver.navigate().back();
			driver.navigate().refresh();

		}

		if (option.contains("Store Details")) {

			driver.findElement(storeDetails).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			driver.navigate().back();
			driver.navigate().refresh();
		}

		if (option.contains("Smart Screen Information")) {

			driver.findElement(smartScreen).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			driver.navigate().back();
			driver.navigate().refresh();
		}

	}

}
