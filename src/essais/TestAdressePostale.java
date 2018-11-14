package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr = new AdressePostale();
		adr.numero = "3";
		adr.rue = "des lilas";
		adr.ville = "Montpellier";
		adr.codepostal = "34000";
		
		adr.affiche();
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numero = "25";
		adr2.rue = "de la lavande";
		adr2.ville = "Jacou";
		adr2.codepostal = "34830";
		
		adr2.affiche();
	}
}
