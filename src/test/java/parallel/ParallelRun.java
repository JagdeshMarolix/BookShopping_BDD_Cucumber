package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/src/test/resource/parallel/SubscribeLetter.feature"},
		/* glue = {"parallel"}, */
		plugin = {"pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}
		
		)	

public class ParallelRun extends AbstractTestNGCucumberTests {
	
	  @Override
	  
	  @DataProvider (parallel = false) // very important step for parallel execution.
	  public Object[][] scenarios() { 
		  return super.scenarios();
	  
	  }
	 
}
