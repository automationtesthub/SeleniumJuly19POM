package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
private WebDriver driver;

public loginPage(WebDriver driver)
{
	this.driver=driver;
}


By imglogo     = By.xpath("//img[@src='include/images/vtiger-crm.gif']");
By txtusername = By.name("user_name");
By txtpassword = By.name("user_password");
By btnLogin    = By.name("Login");
By lblErrorMsg = By.xpath("//*[contains(text(),'You must specify a valid username and password')]");

public boolean login(String user, String pwd)
{
	driver.findElement(txtusername).clear();
	driver.findElement(txtusername).sendKeys(user);
	driver.findElement(txtpassword).clear();
	driver.findElement(txtpassword).sendKeys(pwd);
	driver.findElement(btnLogin).click();
	
	try
	{
	driver.findElement(lblErrorMsg).isDisplayed();
	return false;
	}
	catch(Throwable t)
	{
		t.getMessage();		
		return true;
		
	}
	
	
}

public boolean verifyLogo()
{
	try
	{
	driver.findElement(imglogo).isDisplayed();
	return true;
	}
	catch(Throwable t)
	{
		t.getMessage();
		return false;
	}
}


public boolean verifyTitle(String vExp)
{
	if(driver.getTitle().trim().equals(vExp))
	{
		return true;
	}
	else
	{
		return false;
	}
}



	
	
	

}
