package com.selenium.inputForms;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.testData.SimpleFormDAO;


public class SimpleForm {
	WebDriver driver;
	
	public SimpleForm(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {	
		driver.findElement(a_inputForms).click();
	}
	
	By a_simpleForm = By.linkText("Simple Form Demo");
	
	public void enterSimpleForm() {
		driver.findElement(a_simpleForm).click();
	}
	
	By input_message 		= By.xpath("//input[@id='user-message']");
	By button_showMessage 	= By.xpath("//button[contains(@class,'btn-default') and text()='Show Message']");
	
	public void singleInputField() {
		driver.findElement(input_message).sendKeys(SimpleFormDAO.message);
		driver.findElement(button_showMessage).click();
	}
	
	By span_display = By.xpath("//span[@id='display']");
	
	public void verifyOutputMessage() {
		driver.findElement(span_display).isDisplayed();
		Assert.assertEquals(SimpleFormDAO.message, driver.findElement(span_display).getText());
	}
	
	By input_valuea 	= By.xpath("//input[@id='sum1']");
	By input_valueb 	= By.xpath("//input[@id='sum2']");
	By button_getTotal 	= By.xpath("//button[contains(@class,'btn-default') and text()='Get Total']");
	
	public void twoInputFields() {
		driver.findElement(input_valuea).sendKeys(SimpleFormDAO.entera);
		driver.findElement(input_valueb).sendKeys(SimpleFormDAO.enterb);
		driver.findElement(button_getTotal).click();
	}
	
	By span_displayValue = By.xpath("//span[@id='displayvalue']");
	
	public void verifyOutputResult() {
		driver.findElement(span_displayValue).isDisplayed();
		Assert.assertEquals(SimpleFormDAO.result, driver.findElement(span_displayValue).getText());
	}
}
