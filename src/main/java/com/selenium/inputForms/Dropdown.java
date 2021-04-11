package com.selenium.inputForms;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.testData.DropdownDAO;

public class Dropdown {
	WebDriver driver;
	
	public Dropdown(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {
		driver.findElement(a_inputForms).click();
	}
	
	By a_dropDownSite	 = By.linkText("Select Dropdown List");
	
	public void enterDropDownSite() {
		driver.findElement(a_dropDownSite).click();
	}
	
	By select_singleForm	= By.xpath("//select[@id='select-demo']");
	By verify_singleOptionValue	= By.xpath("//p[@class='selected-value']");
	
	public void selectSingleOption() {
		Select selected = new Select(driver.findElement(select_singleForm));
		selected.selectByValue(DropdownDAO.optionValue);
	}
	
	public void verifySingleOptionValue() {
		driver.findElement(verify_singleOptionValue).isDisplayed();
		Assert.assertEquals("Day selected :- "+DropdownDAO.optionValue, driver.findElement(verify_singleOptionValue).getText());
	}
	
	By select_multipleForm	= By.xpath("//select[@id='multi-select']");
	
	public void selectMultipleOption() {
		List<WebElement>selected = new Select(driver.findElement(select_multipleForm)).getOptions();
		for(WebElement se:selected) {
			new Select(driver.findElement(select_multipleForm)).selectByVisibleText(se.getText());
		}
	}
	
	By button_firstSelected		= By.xpath("//button[@id='printMe']");
	By button_getAllSelected	= By.xpath("//button[@id='printAll']");
	By p_verifySelected			= By.xpath("//p[@class='getall-selected']");
	
	public void firstSelected() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(button_firstSelected).click();
	}
	
	public void verifyFirstSelected() {
		driver.findElement(p_verifySelected).isDisplayed();
		Assert.assertEquals("First selected option is : "+DropdownDAO.selected1, driver.findElement(p_verifySelected).getText());
	}
	
	public void getAllSelected() {
		driver.findElement(button_getAllSelected).click();
	}
	
	public void verifyAllSelected() {
		driver.findElement(p_verifySelected).isDisplayed();
		Assert.assertEquals("Options selected are : "+DropdownDAO.selected1, driver.findElement(p_verifySelected).getText());
	}
}
