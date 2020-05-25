package life.animals;

public abstract class FarmAnimal extends Animal {
	private double cost;
	
	public FarmAnimal(String sn) {
		super(sn);
		// TODO Auto-generated constructor stub
	}
	
	public FarmAnimal(String sn, String cn) {
		super(sn, cn);
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void showLove() {
		System.out.println("Showing love...");
	}
	
	public void mourn() {
		System.out.println("Mourning...");
	}
}
