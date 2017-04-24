package metier;

public class ColVert extends Canard {

	public ColVert() {
		super();
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecdesAiles();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un Colvert");
		
		
	}

	
	
}
