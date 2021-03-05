//package com.stepDefinitions;
//
//import org.apache.commons.logging.Log;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class AllstepDefinitions {
//	public static WebDriver driver;
//	public static WebDriverWait wait;
//
//	
//	
//
//	
//
////	@Then("^I should see the new tab open$")
////	public void i_should_see_the_new_tab_open() throws Throwable {
////
////		Assert.assertEquals("https://www.kiwirailfreight.co.nz/rail-freight", driver.getCurrentUrl());
////		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Book')]"));
////		Actions actions = new Actions(driver);
////		actions.moveToElement(element);
////		actions.perform();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//h3[contains(text(),'Book')]")).click();
////		Thread.sleep(3000);
////		for (String handle1 : driver.getWindowHandles()) {
////			System.out.println(handle1);
////			driver.switchTo().window(handle1);
////		}
////	}
//
//	@Then("^I should see the freight login page$")
//	public void i_should_see_the_freight_login_page() throws Throwable {
//
//		Assert.assertEquals("https://freight.kiwirail.co.nz/login", driver.getCurrentUrl());
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@test1.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Test217631");
//		driver.findElement(By.cssSelector("#login button")).click();
//		String actualMessage = driver.findElement(By.cssSelector(".alert.error")).getText();
//		String expetedErrorMessage = "You've entered an incorrect user name or password. Please try again or select the Trouble logging in? link below to request a password reset.";
//		Assert.assertEquals(expetedErrorMessage, actualMessage);
//		// Log.info(actualMessage);
//		driver.findElement(By.cssSelector(".guest-booking.widget .button")).click();
//	}
//
//	@Given("^I am on the Freight Login page$")
//	public void i_am_on_the_Freight_Login_page() throws Throwable {
//
//		Assert.assertEquals("https://freight.kiwirail.co.nz/login", driver.getCurrentUrl());
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@test1.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Test217631");
//		driver.findElement(By.cssSelector("#login button")).click();
//
//	}
//
////	@When("^I click on Request a Quote$")
////	public void i_click_on_Request_a_Quote() throws Throwable {
////
////		driver.findElement(By.linkText("Request a quote")).click();
////
////	}
//
////	@Then("^I should able to enter all the fields$")
////	public void i_should_able_to_enter_all_the_fields() throws Throwable {
////		driver.findElement(By.id("productForm.kiwirailToSupply")).click();
////		driver.findElement(By.xpath("//*[@id=\"productForm.quantity\"]")).sendKeys("20");
////		Select drpd = new Select(driver.findElement(By.xpath("//*[@id=\\\"productForm.quantity\\\"]")));
////		drpd.selectByValue("20");
////
////		// WebDriverWait wait = new WebDriverWait(driver, 3000);
////
////		driver.findElement(By.xpath("//*[@id=\"productForm.containerSize-button\"]/span[1]")).click();
////
////		Select drp = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
////		drp.selectByVisibleText("10");
////
////		WebDriverWait wait1 = new WebDriverWait(driver, 3);
////		wait1.until(ExpectedConditions.elementToBeSelected(By.cssSelector(".ui-selectmenu-status")));
////
////		Select drp1 = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
////		drp1.selectByVisibleText("20");
////
////		driver.findElement(By.id("productForm.weight")).sendKeys("20");
////
////		Select dropdown = new Select(driver.findElement(By.cssSelector("..ui-selectmenu-status")));
////		dropdown.selectByVisibleText("Household effects");
////
////		driver.findElement(By.id("productForm.hazardous1")).click();
////
////		// Contact Details
////		driver.findElement(By.id("contactForm.email")).sendKeys("test@gmail.com");
////		driver.findElement(By.id("contactForm.confirmEmail")).sendKeys("test@gmail.com");
////		driver.findElement(By.id("contactForm.firstName")).sendKeys("abc123");
////		driver.findElement(By.id("contactForm.lastName")).sendKeys("abc123");
////		driver.findElement(By.id("contactForm.customerReference")).sendKeys("S2df34");
////		driver.findElement(By.id("contactForm.areaCode")).sendKeys("09");
////		driver.findElement(By.id("contactForm.phoneNumber")).sendKeys("3471471");
////		driver.findElement(By.id("contactForm.company")).sendKeys("TestCompany");
////		// Origin Details
////		driver.findElement(By.id("originForm.truckRequired1")).click();
////		// Deliver to
////		Select dropdown1 = new Select(driver.findElement(By.cssSelector(".ui-selectmenu-status")));
////		dropdown1.selectByVisibleText("Auckland");
////		driver.findElement(By.cssSelector(".ui-selectmenu-status")).click();
////		driver.findElement(By.id("originForm.travelDate")).sendKeys("08/03/2021");
////		driver.findElement(By.xpath("//*[@id=\"originForm.travelTime-button\"]/span[1]")).click();
////		driver.findElement(By.xpath("//*[@id=\"originForm.specialInstructions\"]")).sendKeys("Handle with Care");
////
////		// Destination Details
////		driver.findElement(By.xpath("//*[@id=\"destinationForm.location-button\"]/span[1]")).sendKeys("Auckland");
////		driver.findElement(By.xpath("//*[@id=\"destinationForm.travelDate\"]")).sendKeys("10/03/2021");
////		driver.findElement(By.xpath("//*[@id=\"destinationForm.specialInstructions\"]")).sendKeys("Fragile");
////
////	}
//
//	@Then("^I should click on Next  button$")
//	public void i_should_click_on_Next_button() throws Throwable {
//
//		driver.findElement(By.xpath("//*[@id=\"inputForm\"]/div[3]/div[2]/button")).click();
//	}
//
//	@Then("^I should verify all the fields$")
//	public void i_should_verify_all_the_fields() throws Throwable {
//
//	}
//
//}
