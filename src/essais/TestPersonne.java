package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		
		
		AdressePostale a = new AdressePostale (5, "rue d'Antrain", "Rennes", 35700);
		AdressePostale b = new AdressePostale (85, "avenue du marché", "Nantes", 44100);
		
		/*
		AdressePostale adr1 = new AdressePostale();
		adr1.numero = 3;
		adr1.rue = "des lilas";
		adr1.ville = "Montpellier";
		adr1.codePostal = 34000;
		*/
		
		
		
		// TODO Auto-generated method stub
		Personne pers1 = new Personne();
		pers1.nom = "Jean";
		pers1.prenom = "Michel";
		pers1.adressePostale = a ;
		
		pers1.affiche();
		
		
		
		// ================
		
		/*
		AdressePostale adr2 = new AdressePostale();
		adr2.numero = 25;
		adr2.rue = "de la lavande";
		adr2.ville = "Jacou";
		adr2.codePostal = 34830;
		*/
		
		
		
		Personne pers2 = new Personne();
		pers2.nom = "Jean";
		pers2.prenom = "Michel";
		pers2.adressePostale = b ;
		
		pers2.affiche();
		
		
		// --------------------------------------------
		
		
		
	
	}
}
