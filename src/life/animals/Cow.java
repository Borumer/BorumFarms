package life.animals;
import farmerrors.MilkOverflowError;
import workstation.Bucket;

public class Cow extends FarmAnimal implements Milkable {
	private String breed;
	private boolean branded;
	
	public Cow() {
		super("Bos (primigenius) taurus", "Black Angus");
		breed = "Black Angus";
	}
	
	public Cow(boolean b) {
		super("Bos (primigenius) taurus", "Black Angus");
		branded = b;
	}
	
	public Cow(String bre, boolean bra, String sn, String cn) {
		super(sn, cn);
		breed = bre;
		branded = bra;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isBranded() {
		return branded;
	}
	
	public void setBranded(boolean branded) {
		this.branded = branded;
	}
	
	public String toString() {
		String str = "Breed: " + breed
				+ "\nBranded: " + branded;
		return str;
	}
	
	public void giveMilk(Bucket b, double amountOfMilk) throws MilkOverflowError {
		b.putMilk(amountOfMilk);
		System.out.println("Cow giving " + amountOfMilk + " fl. oz. of milk into a bucket");
	}
	
	public void jump() {
		System.out.println("I'm jumping!");
	}
	
	public void moo() {
		System.out.println("Moo!");
	}
}
