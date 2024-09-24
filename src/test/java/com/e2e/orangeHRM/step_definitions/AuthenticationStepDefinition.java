package com.e2e.orangeHRM.step_definitions;

import com.e2e.orangeHRM.page_object.AuthenticationPage;
import com.e2e.orangeHRM.utils.ConfigFileReader;
import com.e2e.orangeHRM.utils.SeleniumUtils;
import com.e2e.orangeHRM.utils.Validations;
 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {
	 public AuthenticationPage authenticationPage;
	 public ConfigFileReader configFileReader;
	 public SeleniumUtils seleniumUtils;
	 public Validations validations;
	 public AuthenticationStepDefinition() {
		 authenticationPage = new AuthenticationPage();
		 configFileReader =new ConfigFileReader();
		 seleniumUtils = new SeleniumUtils();
		 validations = new Validations();
		 
		 
		 
		 
	 }
	
	
	@Given("Je visite le site OrangeHRM")
	public void jeVisiteLeSiteOrangeHRM() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	     
	}
	@When("Je saisis le login")
	public void jeSaisisLeLogin()   {
		 
		AuthenticationPage.getUsername().clear();
		
		seleniumUtils.writeText(AuthenticationPage.getUsername(),(configFileReader.getProperties("home.login")));
	     
	}
	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		seleniumUtils.writeText(AuthenticationPage.getPassword(), (configFileReader.getProperties("home.password")));
		
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(AuthenticationPage.getBtnLogin());
	     
	}
	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPageHome(String expectedURL) {
		validations.checkChangedURL(expectedURL);
	     
	}




}
