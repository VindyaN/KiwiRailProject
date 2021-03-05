package com.runner;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pages.FreightLoginPage;
import com.pages.HomePage;
import com.pages.RailFreightPage;
import com.pages.RequestaQuotepage;

public class  BaseClass {

	public static WebDriver driver;
	public static HomePage homepage = new HomePage();
	public static RailFreightPage railfreightpage = new RailFreightPage();
	public static RequestaQuotepage requestaQt = new RequestaQuotepage();
	public static FreightLoginPage freightLP = new FreightLoginPage();
	
	
}
