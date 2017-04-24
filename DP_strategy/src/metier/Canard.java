package metier;

public abstract class Canard {

	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	
	
	public void effectuerVol(){
		comportementVol.voler();
		
	}
	//Getter et Setter
	
	public ComportementVol getComportementVol() {
		return comportementVol;
	}


	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}


	public ComportementCancan getComportementcancan() {
		return comportementCancan;
	}


	public void setComportementcancan(ComportementCancan comportementcancan) {
		this.comportementCancan = comportementcancan;
	}


	
	public void nager(){
		System.out.println("Je sais nager");
	}
	

	
	public abstract void afficher();
	
	
	
	
	
}
