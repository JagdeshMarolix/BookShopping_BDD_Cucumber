package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource/parallel/LoginPage.feature"},
		 glue = {"parallel"}, 
		plugin = {"pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
				}
		/*tags = "not @Skip"*/
		
		)	

public class ParallelRun extends AbstractTestNGCucumberTests {
	
	  @Override
	  
	  @DataProvider (parallel = true) // very important step for parallel execution.
	  public Object[][] scenarios() { 
		  return super.scenarios();
	  
	  }
	 
}
