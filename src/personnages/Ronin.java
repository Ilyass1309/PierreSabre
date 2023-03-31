package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int gain = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + gain + " sous.");
		beneficiaire.recevoir(gain);
	}
}