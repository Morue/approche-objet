package entites;

public class Personne {

	public String nom = "";
	public String prenom = "";
	public String adressepostale = "";
	
	public void affiche()
	{
		System.out.println("Nom => " + nom + ", Prenom => " + prenom + ", Adresse postale => " + adressepostale);
	}
}
