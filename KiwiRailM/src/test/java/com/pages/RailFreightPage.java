package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.runner.BaseClass;

public class RailFreightPage  extends BaseClass{
public void verifyRailfreightpage() {
	
		Assert.assertEquals("https://www.kiwirailfreight.co.nz/rail-freight", driver.getCurrentUrl());
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Book')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//h3[contains(text(),'Book')]")));
		driver.findElement(By.xpath("//h3[contains(text(),'Book')]")).click();
		
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
}
	}
	}

	
	

