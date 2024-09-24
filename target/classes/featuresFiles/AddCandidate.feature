 
@add-candidate
Feature:Je souhaite ajouter un candidat
  Background: 
    Given Je visite le site OrangeHRM
    When Je saisis le login  
    And Je saisis le mot de passe  
    And Je clique sur le bouton login

  @add
  Scenario: Ajout candidat 
  And Je clique sur recruitement 
  And Je clique sur le bouton Add
  And Je saisie le prenom "john"
  And Je saisie le nom intermediaire "Jack" 
  And Je saisie le nom "Rousseau" 
  And Je selectionne le vacancy
  And Je saisie l'email
  And Je saisie le numero de telephone 
  And Je telecharge le cv 
  And Je saisie les keywords
  And Je saisie la date d'application 
  And Je redige les notes 
  And Je clique sur le bouton radio 
  And Je clique sur le bouton save 
  
   