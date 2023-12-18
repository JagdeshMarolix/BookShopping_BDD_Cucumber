package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SusbcribeLetterPage {
	//1. By Locators
	private WebDriver driver;
	
	private By emailAddressField = By.xpath("//input[@placeholder='Your email address']");
	private By subscribeButton = By.xpath("//input[@value='Subscribe']");
	private By successMessg = By.xpath("//p[contains(text(),'Thank you, your sign-up request was successful! Pl')]");
	
	
	
	//2. Constructors
	public SusbcribeLetterPage(WebDriver driver) {
		this.driver = driver;	
	}
	public String getShopPageTitle() {
		return driver.getTitle();
	}
	//3. Page Class
	
	public void addEmailAddress(String heading) {
		driver.findElement(emailAddressField).sendKeys(heading);	
	}
	public void clickSubscribe() {
		driver.findElement(subscribeButton).click();
	}
	public String getSuccessMesg() {
		return driver.findElement(successMessg).getText();
	}
	

}
