package com.delta.testclasses;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.delta.basetest.BaseTest;
import com.delta.pageclasses.NavlinkPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class FlightStatusTest extends BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		
		reports = new ExtentReports(System.getProperty("user.dir") + "/reports/report.html");
		
		test = reports.startTest("Flight Status Test");
		
		driver.get(baseURL);
		
		test.log(LogStatus.INFO, "Launch Delta Application");
		
		navLinkPage = new NavlinkPage(driver);
		flightStatusPage = navLinkPage.clickOnFlightStatusLink();
		test.log(LogStatus.INFO, "clicked on flight status link");
		
		
	}

	@Test
	public void flightStatusByDateTest() {
		
		flightStatusPage.clickSearchByDate();
		test.log(LogStatus.INFO, "clicked on search date button");
		flightStatusPage.clickOnLeftCalender("23");
		test.log(LogStatus.INFO, "Picked date 23rd");
		flightStatusPage.clickOnDone();
		test.log(LogStatus.INFO, "clicked on done");
		flightStatusPage.flightNumberField("1150");
		test.log(LogStatus.INFO, "send text to flightnumber field :: 1150");
		flightStatusPage.clickOnSubmit();
		test.log(LogStatus.INFO, "clicked on submit button");
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		
		String path = System.getProperty("user.dir");
		System.out.println("path => " + path);
		
		String directory = path + "\\screenshots\\";
		System.out.println(directory);
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + "image.png"));
		
		reports.endTest(test);
		reports.flush();
	
		
	}

}
