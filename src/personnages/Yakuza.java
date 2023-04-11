package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation++;
		parler("J'ai piqué  les " + gain + " sous de " + victime.getNom() 
		+ ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int gain = getArgent();
		perdreArgent(gain);
		reputation --;
		parler("J'ai perdu mon duel et mes " + gain + " sous, snif... J'ai déshonoré le clan de " + clan);
		return gain;
	}
	
	public int gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " 
				+ clan + " ?\n Je l'ai dépouillé de ses " + gain + " sous.");
		return gain;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
}
