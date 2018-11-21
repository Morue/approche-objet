package entites;

public class AdressePostale {

	public int numero = -1;
	public String rue = "";
	public String ville = "";
	public int codePostal = -1;
	
	
	public AdressePostale (int numero, String rue, String ville, int codePostal) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	

	public void affiche()
	{
		System.out.println("Numéro => " + numero + ", rue => " + rue + ", ville => " + ville + ", codepostal => " + codePostal);
	}

}
