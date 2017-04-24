package metier;

public class ScooterElectrique extends Scooter {

	public ScooterElectrique(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Le Scooter Electrique de modèle " + modele + " de couleur "+ couleur + " de puissance " + puissance );
	}

	
	
}
