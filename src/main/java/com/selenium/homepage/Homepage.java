package com.selenium.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	By sitename = By.xpath("//div[@id='site-name']");
	
	public void navigateUrl() {
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	}
	
	public void verifyHomepage() {
		driver.findElement(sitename).isDisplayed();
	}
}
