package life.animals;

public class Sheep extends FarmAnimal {
	private int wool; // The amount of fur on the sheep in pounds
	
	public Sheep(String sn, String cn) {
		super(sn, cn);
	}
	
	public Sheep(String sn) {
		super(sn);
	}

	public int getWool() {
		return wool;
	}

	public void setWool(int wool) {
		this.wool = wool;
	}
	
	public void bleet() {
		System.out.println("Baaaah!");
	}
}
