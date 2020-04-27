package com.delta.basetest;

import org.testng.annotations.BeforeClass;

import com.delta.pageclasses.BookPage;
import com.delta.pageclasses.CheckInPage;
import com.delta.pageclasses.FlightStatusPage;
import com.delta.pageclasses.NavlinkPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {

	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public String baseURL;
	public BookPage bookPage;
	public CheckInPage checkinPage;
	public FlightStatusPage flightStatusPage;
	public NavlinkPage navLinkPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/Users/afahmed/Downloads/geckodriver");

		
		
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		baseURL = "https://www.delta.com/";
		
		
	}

	@AfterClass
	public void afterClass() {
	}

}
