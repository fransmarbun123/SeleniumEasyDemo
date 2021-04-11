Feature: Selenium Easy Testing Complete Automation Testing Tutorials

@Homepage
Scenario: Homepage
	Given User open browser
	When User enter the url
	Then User successfully enter the site

@SimpleForm
Scenario: Simple Form
	Given User is on simple form demo site
	When User input single input field form
	And User input two input fields
	Then Simple form successfully filled
	
@Checkbox
Scenario: Checkbox
	Given User is on checkbox site
	When User checklist single checkbox demo
	And User checklist multiple checkbox demo
	Then Checkbox demo successfully checked
	
@RadioButton
Scenario: RadioButton
	Given User is on radio button site
	When User click radio button demoform
	And User click group radio buttons demo form
	Then Radio button is checked
	
@Dropdown
Scenario: Dropdown
	Given User is on dropdown site
	When User select list demo form
	And User select multiple select list demo form
	Then Drodown is selected
	
@FormSubmit
Scenario: Input Form Submit
	Given User is on input form submit site
	When User input all form fields
	Then input form is filled
	
	
	
	