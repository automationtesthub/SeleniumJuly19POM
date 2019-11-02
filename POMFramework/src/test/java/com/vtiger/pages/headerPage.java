package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headerPage extends leftPage {
	
	public WebDriver driver;
	
	public headerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By lnkLogout = By.linkText("Logout");
	By lnkMyAccount = By.linkText("My Account");
	By lnkSettings = By.linkText("Settings");
	By lnkNewLead = By.linkText("New Lead");
	By lnkLeads = By.linkText("Leads");
	
	
	public boolean clickLogout()
	{
		try {
			driver.findElement(lnkLogout).click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean clickNewLead()
	{
		try {
			driver.findElement(lnkNewLead).click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickLeads()
	{
		try {
			driver.findElement(lnkLeads).click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	

}
