package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//1. By locators
	private By emailId = By.xpath("//input[@id='reg_email']");
	private By password = By.id("reg_password");
	private By LogInButton = By.xpath("//input[@name='login']");
	private By ForgotPwdLink = By.xpath("//a[normalize-space()='Lost your password?']");
	
	//2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//3. page actions: features(behaviour) of the page the form of methods:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(ForgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(LogInButton).click();
	}
	
}