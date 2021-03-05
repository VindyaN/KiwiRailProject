package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.runner.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RequestaQuotepage extends BaseClass {

	public void verifyRequestaQuote() {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Request a quote")));

		driver.findElement(By.linkText("Request a quote")).click();
	}

	public void enterAllFields() {
		driver.findElement(By.id("productForm.kiwirailToSupply")).click();
		driver.findElement(By.xpath("//*[@id=\"productForm.quantity\"]")).sendKeys("20");
		Select drpd = new Select(driver.findElement(By.xpath("//*[@id=\\\"productForm.quantity\\\"]")));
		drpd.selectByValue("20");
		driver.findElement(By.xpath("//*[@id=\"productForm.containerSize-button\"]/span[1]")).click();
		Select drp = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
		drp.selectByVisibleText("10");
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.elementToBeSelected(By.cssSelector(".ui-selectmenu-status")));
		Select drp1 = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
		drp1.selectByVisibleText("20");
		driver.findElement(By.id("productForm.weight")).sendKeys("20");
		Select dropdown = new Select(driver.findElement(By.cssSelector("..ui-selectmenu-status")));
		dropdown.selectByVisibleText("Household effects");
		driver.findElement(By.id("productForm.hazardous1")).click();

		// Contact Details
		driver.findElement(By.id("contactForm.email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("contactForm.confirmEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("contactForm.firstName")).sendKeys("abc123");
		driver.findElement(By.id("contactForm.lastName")).sendKeys("abc123");
		driver.findElement(By.id("contactForm.customerReference")).sendKeys("S2df34");
		driver.findElement(By.id("contactForm.areaCode")).sendKeys("09");
		driver.findElement(By.id("contactForm.phoneNumber")).sendKeys("3471471");
		driver.findElement(By.id("contactForm.company")).sendKeys("TestCompany");
		// Origin Details
		driver.findElement(By.id("originForm.truckRequired1")).click();
	
		Select dropdown1 = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
		dropdown1.selectByVisibleText("Auckland");
		driver.findElement(By.cssSelector(".ui-selectmenu-status")).click();
		driver.findElement(By.id("originForm.travelDate")).sendKeys("08/03/2021");
		driver.findElement(By.xpath("//*[@id=\"originForm.travelTime-button\"]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"originForm.specialInstructions\"]")).sendKeys("Handle with Care");

		// Destination Details
		driver.findElement(By.xpath("//*[@id=\"destinationForm.location-button\"]/span[1]")).sendKeys("Auckland");
		driver.findElement(By.xpath("//*[@id=\"destinationForm.travelDate\"]")).sendKeys("10/03/2021");
		driver.findElement(By.xpath("//*[@id=\"destinationForm.specialInstructions\"]")).sendKeys("Fragile");

	}

	@Then("^I should click on Next  button$")
	public void i_should_click_on_Next_button() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"inputForm\"]/div[3]/div[2]/button")).click();

	}
}
