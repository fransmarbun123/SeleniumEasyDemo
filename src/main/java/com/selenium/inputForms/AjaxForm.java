package com.selenium.inputForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.testData.AjaxFromDAO;

public class AjaxForm {
	WebDriver driver;
	
	public AjaxForm(WebDriver driver) {
		this.driver = driver;
	}
	
	By a_inputForms = By.linkText("Input Forms");
	
	public void enterInputForm() {
		driver.findElement(a_inputForms).click();
	}
	
	By a_ajaxForm	= By.linkText("Ajax Form Submit");
	
	public void enterAjaxForm() {
		driver.findElement(a_ajaxForm).click();
	}
	
	By input_name = By.xpath("//input[@name='title']");
	By textarea_comment = By.xpath("//textarea[@name='description']");
	
	public void inputAjaxForm() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(input_name).sendKeys(AjaxFromDAO.name);
		driver.findElement(textarea_comment).sendKeys(AjaxFromDAO.comment);
	}
	
	By button_submit = By.xpath("//input[@id='btn-submit']");
	
	public void clickSubmit(){
		driver.findElement(button_submit).click();
	}
	
	By div_submitControl = By.xpath("//div[@id='submit-control']");
	
	public void verifySubmitSuccess(){
		driver.findElement(div_submitControl).isDisplayed();
	}
}
