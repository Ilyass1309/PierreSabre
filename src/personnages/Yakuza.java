package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation++;
		parler("J'ai piqué  les " + gain + " sous de " + victime.getNom() 
		+ ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
