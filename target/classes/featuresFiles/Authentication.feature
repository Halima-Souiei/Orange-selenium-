 
@login-orange
Feature: Je souhaite verifier la page de connexion
  ETQ utilisateur je souhaite verifier la page de connexion

  Background: 
    Given Je visite le site OrangeHRM
    When Je saisis le login  
    And Je saisis le mot de passe  
    And Je clique sur le bouton login

  @login-valide
  Scenario: Connexion avec des donnees valides
    Then Je me redirige vers la page "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"  