package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int nbArgent = getArgent();
		perdreArgent(nbArgent);
		parler("Le monde est vraiment trop injuste");
		return nbArgent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous !" + " Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
