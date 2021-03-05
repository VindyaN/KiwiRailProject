package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.runner.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class RequestaQuotestepDefinitionsPage extends BaseClass {
	

	@When("^I click on Request a Quote$")
	public void i_click_on_Request_a_Quote() throws Throwable {

		requestaQt.verifyRequestaQuote();
	}

	@Then("^I should able to enter all the fields$")
	public void i_should_able_to_enter_all_the_fields() throws Throwable {
		requestaQt.enterAllFields();
		
		
	}
	@Then("^I should click on Next button$")
	public void i_should_click_on_Next_button() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"inputForm\"]/div[3]/div[2]/button")).click();
	}



}
