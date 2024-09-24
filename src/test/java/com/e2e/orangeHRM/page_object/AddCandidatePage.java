package com.e2e.orangeHRM.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.orangeHRM.utils.BasePage;
import com.e2e.orangeHRM.utils.Setup;

public class AddCandidatePage extends BasePage {
	@FindBy(how = How.XPATH, using ="//span[normalize-space()='Recruitment']")
	private static WebElement btnRecruitement;
	
	@FindBy(how = How.XPATH, using ="//button[normalize-space()='Add']")
	private static WebElement btnAdd;
	
	@FindBy(how = How.XPATH, using ="//input[@name='firstName']")
	private static WebElement firstName;
	
	@FindBy(how = How.XPATH, using ="//input[@name='middleName']")
	private static WebElement midName;
	
	
	@FindBy(how = How.XPATH, using ="//input[@name='lastName']")
	private static WebElement lastName;
	
	
	
	

	public AddCandidatePage() {
		super(Setup.getDriver());
	}

	public static WebElement getRecruitement() {
		return btnRecruitement;
	}
	
	public static WebElement getBtnAdd() {
		return btnAdd;
	}
	
	public static WebElement getFirstName() {
		return firstName;
	}
	
	public static WebElement getMidName() {
		return midName;
	}
	public static WebElement getLastName() {
		return lastName;
	}
	
}