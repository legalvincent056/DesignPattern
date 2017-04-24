package metier;

public class CanardPlastique extends Canard{

	public CanardPlastique() {
		super();
		comportementCancan = new Coincoin();
		comportementVol = new NePasVoler();
		
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un Canard Plastique");
		
		
	}

	
	
	
}
