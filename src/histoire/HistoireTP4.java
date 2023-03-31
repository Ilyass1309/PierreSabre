package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

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
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
//		yakuza.direBonjour();
//		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
//		yakuza.parler( marco.getNom() +", si tu tiens à la vie donne moi ta bourse !");
//		yakuza.extorquer(marco);
		
		
		Ronin ronin = new Ronin("Roro", "shochu", 54);
//		ronin.direBonjour();
//		ronin.donner(marco);
		
		ronin.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		ronin.provoquer(yakuza);
	}
}

