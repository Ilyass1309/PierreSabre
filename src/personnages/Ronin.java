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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur--;
		}
	}
}
