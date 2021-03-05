package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.BaseClass;

public class HomePage  extends BaseClass {
	public void verifyHomePage() {
	
		
	}

	public void verifyRailFreight() {
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Rail freight")).click();
		for (String tabHandle : driver.getWindowHandles()) {
		System.out.println(tabHandle);driver.switchTo().window(tabHandle);
	
		
	}
		}
}