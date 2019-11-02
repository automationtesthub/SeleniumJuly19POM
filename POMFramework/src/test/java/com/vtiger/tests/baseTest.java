package com.vtiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vtiger.common.CommonFunction;
import com.vtiger.common.config;

public class baseTest {
	
	public  WebDriver driver; 
	public  ExtentReports report;
	public  ExtentTest logger; 
	public  String extentReport;
	
	
	public void launchApp(String browser)
	{
		CommonFunction cm= new CommonFunction();
		report=cm.setupResult(browser);
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/java/com/vtiger/utility/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/com/vtiger/utility/chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(config.url);
	}
	
	public void tierdown()
	{
		driver.quit();
	}
	
	public void createtestReport()
	{
		//CommonFunction cm= new CommonFunction();
		//report=cm.setupResult(browser);
	}

}
