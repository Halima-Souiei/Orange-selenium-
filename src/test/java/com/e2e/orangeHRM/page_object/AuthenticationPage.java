package com.e2e.orangeHRM.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.orangeHRM.utils.BasePage;
import com.e2e.orangeHRM.utils.Setup;
 

public class AuthenticationPage extends BasePage {
	 

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private static WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private static WebElement btnLogin;
	
	
	public AuthenticationPage() {
		super(Setup.getDriver());	
	}
	
	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}
	
	public static WebElement getBtnLogin() {
		return btnLogin;
	}


}
