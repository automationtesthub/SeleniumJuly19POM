package com.vtiger.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vtiger.pages.homePage;
import com.vtiger.pages.leadPage;
import com.vtiger.pages.loginPage;

public class E2E extends baseTest{
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchStart(String browser)
	{
		if(driver == null)
		{
		launchApp(browser);
		}
	}
	
	
	@Test(groups = { "regression","sanity"})
	public void TestCase4_leadcreation()
	{
		
		loginPage lp = new loginPage(driver);
		if(lp.verifyLogo())
		{
		lp.login("admin", "admin");
		}
		homePage hp = new homePage(driver);	
		hp.clickNewLead();
		leadPage ldp = new leadPage(driver);	
		boolean val=ldp.createLead("Neha", "TCS");
		Assert.assertEquals(val, true);
		ldp.clickLogout();
		
		
	}
	
	@AfterClass
	public void tierdown()
	{
		driver.quit();
	}

}
