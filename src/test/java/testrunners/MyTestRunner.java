package testrunners;

import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import junit.framework.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/resource/AppFeatures"},
		glue = {"stepdefinations", "AppHooks"},
		plugin = {"pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}
		
		)

public class MyTestRunner 	{																								
	
	
}