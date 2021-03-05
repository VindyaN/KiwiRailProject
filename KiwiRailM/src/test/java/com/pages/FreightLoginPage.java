package com.pages;


import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

public class FreightLoginPage extends BaseClass{
public void verifyFreightLoginPage() {
	
	Assert.assertEquals("https://freight.kiwirail.co.nz/login", driver.getCurrentUrl());
	driver.findElement(By.cssSelector("#username")).sendKeys("test@test1.com");
	driver.findElement(By.cssSelector("#password")).sendKeys("Test217631");
	driver.findElement(By.cssSelector("#login button")).click();
	String actualMessage = driver.findElement(By.cssSelector(".alert.error")).getText();
	String expetedErrorMessage = "You've entered an incorrect user name or password. Please try again or select the Trouble logging in? link below to request a password reset.";
	Assert.assertEquals(expetedErrorMessage, actualMessage);
	//Logger.info(actualMessage);
	

}

public void selectQuoteButton(){
	driver.findElement(By.cssSelector(".guest-booking.widget .button")).click();
	
}
}