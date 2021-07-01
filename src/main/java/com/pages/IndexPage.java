package com.pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class IndexPage {
	
	private WebDriver driver;
	
	// By locator
	private By dropdown_XPATH = By.xpath("//div[@class=' css-1wy0on6']");
	private By serachbox_XPATH = By.xpath("//input[@type='text']");
	private By result_XPATH = By.xpath("//div[@class='list__wrapper container']");
	private By nodata_xpath = By.xpath("//div[@class='col-md-12 align_center']");
	private By Mail_XPATH = By.xpath("//input[@type='email']");
	private By SignInButon_XPATH = By.xpath("//button[@id='next']");
	private By Next_XPATH = By.xpath("//input[@type='submit']");
	private By Pwd_XPATH = By.xpath("//input[@name='passwd']");

	
	//Constructor of the page
	public IndexPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// page Actions
	
	public void logintoB2C(String username, String pwd) {
		driver.findElement(Mail_XPATH).sendKeys(username);
		driver.findElement(SignInButon_XPATH).click();
		driver.findElement(Mail_XPATH).sendKeys(username);
		
		driver.findElement(Next_XPATH).click();
		driver.findElement(Pwd_XPATH).sendKeys(pwd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(Next_XPATH).click();
		driver.findElement(Next_XPATH).click();
	}
	
	public void selectRetailer(String retailer) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.click(driver.findElement(dropdown_XPATH));
		act.sendKeys(retailer);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}
	
	public List<WebElement> listofSearchitem() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		List<WebElement> result = driver.findElements(result_XPATH);
		return result;
	}
	
	public void enterSearchKeyword(String searchKeyWord) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(serachbox_XPATH).sendKeys(searchKeyWord);
	}

}
