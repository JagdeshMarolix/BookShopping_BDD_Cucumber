package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.SusbcribeLetterPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeLetterPageSteps {
	
	private SusbcribeLetterPage subscribeLetterPage = new SusbcribeLetterPage(DriverFactory.getDriver());
	
	
	@Given("user navigates to the shop page")
	public void user_navigates_to_the_shop_page() {
		DriverFactory.getDriver().get("https://practice.automationtesting.in/shop/");
	}

	@When("user enters email address from {string} and rownumber {int}")
	public void user_enters_email_address_from_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\hp\\Desktop\\automation.xlsx", sheetName);
	    String heading = testData.get(rowNumber).get("Emailaddress");
		
	    
	    subscribeLetterPage.addEmailAddress(heading);
	}

	@When("user clicks on subscribe button")
	public void user_clicks_on_subscribe_button() {
		
		subscribeLetterPage.clickSubscribe();
	    
	}

	@Then("it shows a successful message {string}")
	public void it_shows_a_successful_message(String expSuccessMessg) {
		String actualMessg = subscribeLetterPage.getSuccessMesg();
		
	    
	}


}
