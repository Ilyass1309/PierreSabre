package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain humain = new Humain("Prof", "kombucha", 54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.boire();
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
	
}
