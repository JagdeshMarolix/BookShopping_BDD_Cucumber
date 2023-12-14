package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	
	public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<WebDriver>();	
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: " + browser);
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webddriver.gecko.driver","./geckodriver.exe");		
			/*WebDriverManager.firefoxdriver().setup();*/
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please enter the correct browser to launch " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	
	
	
	
	
	
	

}
