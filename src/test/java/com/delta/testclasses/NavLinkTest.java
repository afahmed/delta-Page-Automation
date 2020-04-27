package com.delta.testclasses;

import org.testng.annotations.Test;

import com.delta.basetest.BaseTest;
import com.delta.pageclasses.NavlinkPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

public class NavLinkTest extends BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		

		
		driver.get(baseURL);
		
		navLinkPage = new NavlinkPage(driver);
	}

	@Test
	public void clickOnFlightStatusTest() {
		
		navLinkPage.clickOnFlightStatusLink();
		
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
