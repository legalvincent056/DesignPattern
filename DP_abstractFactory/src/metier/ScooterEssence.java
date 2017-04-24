package metier;

public class ScooterEssence extends Scooter {

	public ScooterEssence(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Le Scooter Essence de modèle " + modele + " de couleur "+ couleur + " de puissance " + puissance );
	}

	
	
}
