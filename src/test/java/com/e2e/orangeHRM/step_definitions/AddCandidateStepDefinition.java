package com.e2e.orangeHRM.step_definitions;

import com.e2e.orangeHRM.page_object.AddCandidatePage;
import com.e2e.orangeHRM.utils.ConfigFileReader;
import com.e2e.orangeHRM.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class AddCandidateStepDefinition {
	public AddCandidatePage addCandidatePage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public AddCandidateStepDefinition() {
		addCandidatePage = new AddCandidatePage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();

	}

	@When("Je clique sur recruitement")
	public void jeCliqueSurRecruitement() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(AddCandidatePage.getRecruitement());
	}

	@When("Je clique sur le bouton Add")
	public void jeCliqueSurLeBoutonAdd() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(AddCandidatePage.getBtnAdd());

	}

	@When("Je saisie le prenom {string}")
	public void jeSaisieLePrenom(String name)   {
		 ;
		seleniumUtils.writeText(AddCandidatePage.getFirstName(), name);

	}

	@When("Je saisie le nom intermediaire {string}")
	public void jeSaisieLeNomIntermediaire(String interNom) {
		seleniumUtils.writeText(AddCandidatePage.getMidName(), interNom);

	}

	@When("Je saisie le nom {string}")
	public void jeSaisieLeNom(String familyname) {
		seleniumUtils.writeText(AddCandidatePage.getLastName(), familyname);
	}

	@When("Je selectionne le vacancy")
	public void jeSelectionneLeVacancy() {

	}

	@When("Je saisie l'email")
	public void jeSaisieLEmail() {

	}

	@When("Je saisie le numero de telephone")
	public void jeSaisieLeNumeroDeTelephone() {

	}

	@When("Je telecharge le cv")
	public void jeTelechargeLeCv() {

	}

	@When("Je saisie les keywords")
	public void jeSaisieLesKeywords() {

	}

	@When("Je saisie la date d'application")
	public void jeSaisieLaDateDApplication() {

	}

	@When("Je redige les notes")
	public void jeRedigeLesNotes() {

	}

	@When("Je clique sur le bouton radio")
	public void jeCliqueSurLeBoutonRadio() {

	}

	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {

	}
}
