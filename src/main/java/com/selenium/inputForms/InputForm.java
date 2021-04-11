package com.selenium.inputForms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.testData.InputFormDAO;

public class InputForm {
	WebDriver driver;
	
	public InputForm(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {
		driver.findElement(a_inputForms).click();
	}
	
	By a_inputFormSubmit	= By.linkText("Input Form Submit");
	
	public void enterInputFormSubmit() {
		driver.findElement(a_inputFormSubmit).click();
	}
	
	By input_firstName	=	By.xpath("//input[@name='first_name']");
	By input_lastName	= 	By.xpath("//input[@name='last_name']");
	By input_email		= 	By.xpath("//input[@name='email']");
	By input_phone		= 	By.xpath("//input[@name='phone']");
	By input_address	=	By.xpath("//input[@name='address']");
	By input_city		=	By.xpath("//input[@name='city']");
	By select_state		= 	By.xpath("//select[@name='state']");
	By input_zipCode	=	By.xpath("//input[@name='zip']");
	By input_website	=	By.xpath("//input[@name='website']");
	By radiobutton_hosting	=	By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div/label");
	By textarea_projectDescription	=	By.xpath("//textarea[@name='comment']");
	By button_submit	= 	By.xpath("//button[contains(@class,'btn-default')]");
	
	public void inputFirstName(String firstName) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(input_firstName).sendKeys(firstName);
	}
	
	public void inputLastName(String lastName) {
		driver.findElement(input_lastName).sendKeys(lastName);
	}
	
	public void inputEmail(String email) {
		driver.findElement(input_email).sendKeys(email);
	}
	
	public void inputPhone(String phone) {
		driver.findElement(input_phone).sendKeys(phone);
	}
	
	public void inputAddress(String address) {
		driver.findElement(input_address).sendKeys(address);
	}
	
	public void inputCity(String city) {
		driver.findElement(input_city).sendKeys(city);
	}
	
	public void selectState(String state) {
		Select states = new Select(driver.findElement(select_state));
		states.selectByVisibleText(state);
	}
	
	public void inputZip(String zip) {
		driver.findElement(input_zipCode).sendKeys(zip);
	}
	
	public void inputWebsite(String websiteName) {
		driver.findElement(input_website).sendKeys(websiteName);
	}
	
	public void chooseHosting(String hosting) {
		List<WebElement>hostings	= driver.findElements(radiobutton_hosting);
		for(WebElement ho:hostings) {
			if(ho.getText().equalsIgnoreCase(hosting)) {
				ho.click();
			}
		}
	}
	
	public void inputProjectDescription(String description) {
		driver.findElement(textarea_projectDescription).sendKeys(description);
	}
	
	public void clickSend() {
		driver.findElement(button_submit).click();
	}
	
	public void inputForm() throws InterruptedException {
		inputFirstName(InputFormDAO.firstName);
		inputLastName(InputFormDAO.lastName);
		inputEmail(InputFormDAO.email);
		inputPhone(InputFormDAO.phone);
		inputAddress(InputFormDAO.address);
		inputCity(InputFormDAO.city);
		selectState(InputFormDAO.state);
		inputZip(InputFormDAO.zipCode);
		inputWebsite(InputFormDAO.website);
		chooseHosting(InputFormDAO.hosting);
		inputProjectDescription(InputFormDAO.description);
		clickSend();
	}
}
