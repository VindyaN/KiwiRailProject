package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.pages.RailFreightPage;
import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class RailFreightstepDefinitionPage extends BaseClass{
	WebDriver driver;
	
	@Then("^I should see the new tab open$")
	public void i_should_see_the_new_tab_open() throws Throwable {

		railfreightpage.verifyRailfreightpage();
		

}
}
