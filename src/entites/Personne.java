package entites;

public class Personne {

	public String nom = null;
	public String prenom = null;
	public AdressePostale adressePostale = null;
	
	public void affiche()
	{
		System.out.println("Nom => " + nom + ", Prenom => " + prenom + ", Adresse postale => ");
		System.out.println();
		System.out.print("      Adresse => ");
		adressePostale.affiche();
		System.out.println();
	}
}
