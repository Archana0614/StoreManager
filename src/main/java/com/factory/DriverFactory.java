package com.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver= new ThreadLocal<>();

	/*This method is used initialize the threadlocal driver with given browservalue*/
	
	public WebDriver init_driver( String browser) {
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("edgedriver"))
		{
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());
		}
		
		else 
		{
			System.out.println("Enter valid browser value "+ browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		return getDriver();
	}

	
	/* This method used to get the driver with threadlocal */
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
	
	
}
