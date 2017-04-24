package metier;

public class Caramel extends DecoratorIngredient {

	public Caramel(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription() + ", Caramel";
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.22 + boisson.cout();
	}

}
