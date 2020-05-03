package animals;
import farmerrors.MilkOverflowError;
import workstation.Bucket;

public class Cow extends FarmAnimal {
	public void giveMilk(Bucket b, double amountOfMilk) throws MilkOverflowError {
		b.putMilk(amountOfMilk);
	}
}
