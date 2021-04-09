package com.selenium.inputForms;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.testData.CheckboxDAO;

public class Checkbox {
	WebDriver driver;
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {
		driver.findElement(a_inputForms).click();
	}
	
	public Checkbox(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_checkboxSite = By.linkText("Checkbox Demo");
	
	public void enterCheckboxSite() {
		driver.findElement(a_checkboxSite).click();
	}
	
	By checkbox_singleCheckbox 	= By.xpath("//input[@id='isAgeSelected']");
	By div_singleCheckboxMsg 	= By.xpath("//div[@id='txtAge']");
	
	public void singleCheckbox() {
		driver.findElement(checkbox_singleCheckbox).click();
	}
	
	public void verifySingleMsg() {
		driver.findElement(div_singleCheckboxMsg).isDisplayed();
		Assert.assertEquals(CheckboxDAO.singleMsg, driver.findElement(div_singleCheckboxMsg).getText());
	}
	
	By list_checkbox 	= By.xpath("//div[@class='checkbox']//label/input[@class='cb1-element']");
	By button_checkAll 	= By.xpath("//input[@id='check1']");
	
	public void multipleCheckbox() {
		List<WebElement>tasks = driver.findElements(list_checkbox);
		for(WebElement ta:tasks) {
			if(ta.getText().equalsIgnoreCase(CheckboxDAO.checkbox)) {
				ta.click();
			}
		}
	}
	
	public void checkAll() {
		driver.findElement(button_checkAll).click();
	}
}
