package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pages.FreightLoginPage;
import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class FreightLoginstepDefinitionPage extends BaseClass{
	
	@Then("^I should see the freight login page$")
	public void i_should_see_the_freight_login_page() throws Throwable {

		freightLP.verifyFreightLoginPage();
		
	}
}
