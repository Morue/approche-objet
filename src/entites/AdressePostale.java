package entites;

public class AdressePostale {

	public String numero = "";
	public String rue = "";
	public String ville = "";
	public String codepostal = "";

	public void affiche()
	{
		System.out.println("Numéro => " + numero + ", rue => " + rue + ", ville => " + ville + ", codepostal => " + codepostal);
	}

}
