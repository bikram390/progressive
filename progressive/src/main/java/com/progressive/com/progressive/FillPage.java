package com.progressive.com.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillPage {

		
	
	WebDriver driver;
	
	By firstName = By.xpath("//input[@analytics-id='NameAndAddressEdit_FirstName']");
	By lastName = By.id("//input[@analytics-id='NameAndAddressEdit_LastName']");
	By select = By.className("//select[@class='ng-star-inserted']");
	By dateOfBirth = By.id("//input[@id='NameAndAddressEdit_DateOfBirth']");
	By streetNumberAndName = By.id("//input[@id='NameAndAddressEdit_MailingAddress']");
	By okStartButoon = By.id("button[@id='forwardNavigation]");
	
	public FillPage(WebDriver driver) {
		this.driver = driver;

	}
	public void typefirstName(){
		driver.findElement(firstName).sendKeys("David");
			
	}
	public void typeLastName() {
		driver.findElement(lastName).sendKeys("George");
		
	}
	public void typeDateOfBirth() {
		driver.findElement(dateOfBirth).sendKeys("12/14/1965");
		
	}
	public void typeStreetNumberAndName() {
		driver.findElement(streetNumberAndName).sendKeys("163 Lake Shore dr");
	
		
	}
	public void clickOnOkButton(){
		driver.findElement(okStartButoon).click();
	}
	
	
}
