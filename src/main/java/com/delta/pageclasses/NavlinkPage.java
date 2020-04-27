package com.delta.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.delta.base.Base;

// inheritance, it will inherit all the methods and properties
public class NavlinkPage extends Base {
	//XPATH
	private String BOOK = "//ul//a[contains(text(),'BOOK')]";
	// XPATH
	private String CHECK_IN = "//ul//a[contains(text(),'CHECK-IN')]";
	//XPATH
	private String MY_TRIPS = "//ul//a[contains(text(),'MY TRIPS')]";
	//XPATGH
	private String FLIGHT_STATUS = "//ul//a[contains(text(),'FLIGHT STATUS')]";
	
	
	
	
	public NavlinkPage(WebDriver driver) {
		// call the constructor of the parent class
		super(driver);
	}
	
	
	public BookPage clickOnBookLink() {
		
		WebElement bookLink = driver.findElement(By.xpath(BOOK));
		System.out.println("Clicked on book link");
		bookLink.click();
		return new BookPage(driver);
	}
	
	public CheckInPage clickOnCheckInLink() {
		WebElement checkInLink = driver.findElement(By.xpath(CHECK_IN));
		System.out.println("Clicked on check in link");
		checkInLink.click();
		return new CheckInPage(driver);
	}
	
	public FlightStatusPage clickOnFlightStatusLink() {
		WebElement flightStatusLink = driver.findElement(By.xpath(FLIGHT_STATUS));
		System.out.println("Clicked on flight status link");
		flightStatusLink.click();
		return new FlightStatusPage(driver);
	}

}
