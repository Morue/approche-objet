package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.nom = "Jean";
		pers1.prenom = "Michel";
		pers1.adressepostale = "6 rue de la lavande";
		
		pers1.affiche();
	
	}
}
