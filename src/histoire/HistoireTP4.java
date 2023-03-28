package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain humain = new Humain("Prof", "kombucha", 54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.boire();
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);
		
		
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuza.direBonjour();
		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yakuza.parler( marco.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		yakuza.extorquer(marco);
	}
	
}
