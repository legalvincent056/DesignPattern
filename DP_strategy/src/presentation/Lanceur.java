package presentation;

import metier.Canard;
import metier.CanardPlastique;
import metier.Coincoin;
import metier.ColVert;
import metier.Leurre;
import metier.VolerAvecdesAiles;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Canard colvert = new ColVert();
		colvert.afficher();
		colvert.nager();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		
		System.out.println("--------------------------------------------------------------");
		
		Canard leurre = new Leurre();
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
		
		System.out.println("--------------------------------------------------------------");
		
		Canard canardplast = new CanardPlastique();
		canardplast.afficher();
		canardplast.nager();
		canardplast.effectuerCancan();
		canardplast.effectuerVol();
		
		System.out.println("--------------------------------------------------------------");
		leurre.setComportementcancan(new Coincoin()); //modification du comportement du Leurre Cancaner
		leurre.setComportementVol(new VolerAvecdesAiles()); // modification du comportement du Leurre Voler
		leurre.afficher();
		leurre.nager();
		leurre.effectuerCancan();
		leurre.effectuerVol();
	}

}
