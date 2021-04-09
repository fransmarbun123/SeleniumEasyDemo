package stepDefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.homepage.Homepage;
import com.selenium.inputForms.Checkbox;
import com.selenium.inputForms.RadioButton;
import com.selenium.inputForms.SimpleForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumGlue {
	static WebDriver driver;
	
	@Given("User open browser")
	public void user_open_browser() {
		System.setProperty("webdriver.chrome.driver","src\\test\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enter the url")
	public void user_enter_the_url() {
	    Homepage hp = new Homepage(driver);
	    hp.navigateUrl();
	}

	@Then("User successfully enter the site")
	public void user_successfully_enter_the_site() {
	    Homepage hp = new Homepage(driver);
	    hp.verifyHomepage();
	}
	
	@Given("User is on simple form demo site")
	public void user_is_on_simple_form_demo_site() throws MalformedURLException {
	    SimpleForm sf = new SimpleForm(driver);
	    sf.enterInputForm();
	    sf.enterSimpleForm();
	}
	
	@When("User input single input field form")
	public void user_input_single_input_field_form() {
		SimpleForm sf = new SimpleForm(driver);
	    sf.singleInputField();
	    sf.verifyOutputMessage();
	}

	@When("User input two input fields")
	public void user_input_two_input_fields() {
		SimpleForm sf = new SimpleForm(driver);
		sf.twoInputFields();
	    sf.verifyOutputResult();
	}

	@Then("Simple form successfully filled")
	public void simple_form_successfully_filled() {
	    System.out.print("");
	}
	
	@Given("User is on checkbox site")
	public void user_is_on_checkbox_site() {
	    Checkbox cb = new Checkbox(driver);
	    cb.enterInputForm();
	    cb.enterCheckboxSite();
	}

	@When("User checklist single checkbox demo")
	public void user_checklist_single_checkbox_demo() {
		Checkbox cb = new Checkbox(driver);
		cb.singleCheckbox();
		cb.verifySingleMsg();
	}

	@When("User checklist multiple checkbox demo")
	public void user_checklist_multiple_checkbox_demo() {
		Checkbox cb = new Checkbox(driver);
		cb.multipleCheckbox();
		cb.checkAll();
	}

	@Then("Checkbox demo successfully checked")
	public void checkbox_demo_successfully_checked() {
		System.out.print("");
	}
	
	@Given("User is on radio button site")
	public void user_is_on_radio_button_site() {
	    RadioButton rb = new RadioButton(driver);
	    rb.enterInputForm();
	    rb.enterRadioButtonSite();
	}

	@When("User click radio button demoform")
	public void user_click_radio_button_demoform() throws InterruptedException {
		RadioButton rb = new RadioButton(driver);
		rb.radioButtonDemo();
		rb.verifyCheckedValue();
	}

	@When("User click group radio buttons demo form")
	public void user_click_group_radio_buttons_demo_form() {
		RadioButton rb = new RadioButton(driver);
		rb.groupRadioButtonsDemo();
		rb.verifyValue();
	}

	@Then("Radio button is checked")
	public void radio_button_is_checked() {
		System.out.print("");
	}
}
