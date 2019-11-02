package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class leadPage extends headerPage {
	
	
	
	public leadPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	
	WebElement txtLname = driver.findElement(By.name("lastname"));
	By txtcomp= By.name("company");
	By btnSave= By.name("button");
	
	
	public boolean createLead(String lname, String comp)
	{
		txtLname.clear();
		txtLname.sendKeys(lname);
		driver.findElement(txtcomp).clear();
		driver.findElement(txtcomp).sendKeys(comp);
		driver.findElement(btnSave).click();		
		try {
			driver.findElement(By.xpath("//td[@class='moduleTitle' and text()='Lead:   "+lname+"']")).isDisplayed();
		    return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	
	

}
