 package com.delta.pageclasses;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.delta.base.Base;

public class FlightStatusPage extends Base {
	
	// id
	private String SEARCH_BY_DATE_BTN = "input_departureDate_1"; 
	// xpath
	private String LEFT_CALENDER = "//div[@class='dl-datepicker-group dl-datepicker-group-0']//td";
	// xpath
	private String RIGHT_CALENDER = "//div[@class='dl-datepicker-group dl-datepicker-group-1']//td";
	// xpath
	private String DONE = "//button[@value='done']";
	// id
	private String FLIGHT_NUMBER_FIELD = "flightNo";
	// id
	private String SUBMIT_BTN = "btn-flight-sts-submit";

	public FlightStatusPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickSearchByDate() {
		WebElement searchByDate = driver.findElement(By.id(SEARCH_BY_DATE_BTN));
		
		searchByDate.click();
	}
	// we are passing text string "23"
	public void clickOnLeftCalender(String day) {
		
		List<WebElement> datesEl = driver.findElements(By.xpath(LEFT_CALENDER));
		
		for(WebElement el : datesEl) {

			if(el.getText().equals(day)) {
				el.click();
				break;
			}
		}
		
	}
	
	public void clickOnDone() {
		WebElement doneEl = driver.findElement(By.xpath(DONE));
		
		doneEl.click();
	}
	
	// "1049"
	public void flightNumberField(String flightNumber) {
		
		WebElement flightNumberF = driver.findElement(By.id(FLIGHT_NUMBER_FIELD));
		
		flightNumberF.sendKeys(flightNumber);
	}
	
	public void clickOnSubmit() {
		
		WebElement submitBtn = driver.findElement(By.id(SUBMIT_BTN));
		
		submitBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
