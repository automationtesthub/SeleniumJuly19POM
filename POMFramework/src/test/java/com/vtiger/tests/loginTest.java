package com.vtiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vtiger.common.config;
import com.vtiger.pages.loginPage;

public class loginTest extends baseTest {
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchStart(String browser)
	{
		//createtestReport();
		launchApp(browser);
		
	}
	
	
	
	@Test(groups = { "regression","smoke"})
	public void TestCase1_verifyTitle()
	{
		logger = report.startTest("TestCase1_verifyTitle");
		loginPage lp = new loginPage(driver);
		boolean actualval=lp.verifyTitle("vtiger CRM - Commercial Open Source CRM123");
		logger.log(LogStatus.PASS, "Title matched");
		Assert.assertEquals(actualval, true);
		report.endTest(logger);
		report.flush();
	}
	
	@Test(groups = { "regression","sanity"})
	public void TestCase2_verifyLogo()
	{
		logger = report.startTest("TestCase2_verifyLogo");
		loginPage lp = new loginPage(driver);
		boolean actualval=lp.verifyLogo();		
		Assert.assertEquals(actualval, true);	
		logger.log(LogStatus.PASS, "Logo verified");
		report.endTest(logger);
		report.flush();
	}
	
	@Test(groups = { "regression"})

	public void TestCase3_InvalidLogin()
	{
		logger = report.startTest("TestCase3_InvalidLogin");
		loginPage lp = new loginPage(driver);
		boolean actualval=lp.login("asas", "safaafs");
		Assert.assertEquals(actualval, false);		
		logger.log(LogStatus.PASS, "Invalid login suucess");
		report.endTest(logger);
		report.flush();
	}
	
	@Test(groups = { "regression","smoke","sanity"})
	public void TestCase4_Login()
	{
		logger = report.startTest("TestCase4_Login");
		loginPage lp = new loginPage(driver);
		boolean actualval=lp.login("admin", "admin");
		Assert.assertEquals(actualval, true);
		logger.log(LogStatus.PASS, "valid login suucess");
		report.endTest(logger);
		report.flush();
	}
	
	@AfterClass
	public void tierdown()
	{
		//driver.quit();
	}
	
	
	

}
