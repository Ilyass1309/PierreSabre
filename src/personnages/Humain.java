package personnages;

public class Humain {
	private static int nbHumainMax = 30;
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[nbHumainMax];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + getNom() + ")" + "- " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() 
		+ " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. je vais pouvoir m'offir " 
					+ bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. je ne peux même pas m'offir " 
					+ bien + " à " + prix + " sous");
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < nbHumainMax) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i] = memoire[i+1]; 
			}
			memoire[nbConnaissance-1] = humain;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		int i = 0;
		String texte = "Je connais beaucoup de monde dont : ";
		while (i != nbConnaissance && i < nbHumainMax) {
			texte += memoire[i].getNom();
			if (i != nbConnaissance) {
				texte += ", ";
			}
			i++;
		}
		parler(texte);
	}
}
