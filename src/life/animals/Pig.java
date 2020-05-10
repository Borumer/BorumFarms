package life.animals;

public class Pig extends FarmAnimal {
	
	
	public Pig() {
		super("Sus domesticus", "Duroc pig");
	}
	
	public Pig(String sn, String cn) {
		super(sn, cn);
		// TODO Auto-generated constructor stub
	}
	
	public void oink() {
		System.out.println("Oink!");
	}

}
