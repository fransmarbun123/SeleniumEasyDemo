package com.selenium.inputForms;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.testData.RadioButtonDAO;

public class RadioButton {
	WebDriver driver;
	
	public RadioButton(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {
		driver.findElement(a_inputForms).click();
	}
	
	By a_radioButton	= By.linkText("Radio Buttons Demo");
	
	public void enterRadioButtonSite() {
		driver.findElement(a_radioButton).click();
	}
	
	By list_radio 	= By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label");
	By button_check	= By.xpath("//button[@id='buttoncheck']");
	
	public void radioButtonDemo() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement>radios = driver.findElements(list_radio);
		for(WebElement ra:radios) {
			if(ra.getText().equalsIgnoreCase(RadioButtonDAO.selectRadio)) {
				ra.click();
			}
		}
		driver.findElement(button_check).click();
	}
	
	By p_checkedValue = By.xpath("//p[@class='radiobutton']");
	
	public void verifyCheckedValue() {
		driver.findElement(p_checkedValue).isDisplayed();
		Assert.assertEquals(RadioButtonDAO.checkedValue, driver.findElement(p_checkedValue).getText());
	}
	
	By list_gender 		= By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label");
	By list_age			= By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label");
	By button_getValue	= By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
	
	public void groupRadioButtonsDemo() {
		List<WebElement>genders = driver.findElements(list_gender);
		for(WebElement ge:genders) {
			if(ge.getText().equalsIgnoreCase(RadioButtonDAO.gender)) {
				ge.click();
			}
		}
		
		List<WebElement>ages	= driver.findElements(list_age);
		for(WebElement ag:ages) {
			if(ag.getText().equalsIgnoreCase(RadioButtonDAO.age)) {
				ag.click();
			}
		}
		
		driver.findElement(button_getValue).click();
	}
	
	By p_value = By.xpath("//p[@class='groupradiobutton']");
	
	public void verifyValue() {
		driver.findElement(p_value).isDisplayed();
	}
	
}
