package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;
	
	//1.Locators
	private By accountSections = By.xpath("//nav[@class='woocommerce-MyAccount-navigation']/ul/li");
	
	//2.Constructor
	public AccountsPage(WebDriver driver) {
		this.driver = driver;	
	}
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	//3.Page actions
	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
		
	}
	public List<String> getAccountsSectionsList() {
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeadderList = driver.findElements(accountSections);
		
		for(WebElement e : accountsHeadderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
			}
		return accountsList;
	}
	
	

}
