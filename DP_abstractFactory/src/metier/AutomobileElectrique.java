package metier;

public class AutomobileElectrique extends Automobile {

	public AutomobileElectrique(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		
	}

	@Override
	public void afficheCaracteristiques(){
		System.out.println("Automobile electrique de mod�le " + modele + " de couleur "+ couleur + " de puissance " + puissance + " d'espace " + espace);
	}
	
		
}
