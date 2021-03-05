package com.stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomepagestepDefinitions extends BaseClass {
 WebDriver driver;
	
	@Given("^I am in Homepage$")
	public void i_am_in_Homepage() throws Throwable {

		homepage.verifyHomePage();
	}

	@When("^I click on the Rail Freight$")
	public void i_click_on_the_Rail_Freight() throws Throwable {
		
		homepage.verifyRailFreight();
	}
	
	

}

