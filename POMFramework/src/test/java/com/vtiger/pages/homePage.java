package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends headerPage {
	
	private WebDriver driver;

	public homePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	By LblPipeline = By.xpath("//*[text(),'My Pipeline']");
	
	
	public boolean verifyHomePage()
	{
		try {
			driver.findElement(LblPipeline).isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	

}
