package workstation;
import farmerrors.MilkOverflowError;
import life.Person;
import life.animals.Cow;

public class Farmer extends Person {
	
	public Farmer() {
		
	}
	
	/**
	 * Precondition:
	 * Postcondition: 
	 * @param cow
	 * @param bucket
	 * @param amountOfMilk
	 * @author Varun Singh
	 */
	public void fetchMilk(Cow cow, Bucket bucket, double amountOfMilk) {
		try {
			cow.giveMilk(bucket, amountOfMilk);
			System.out.println("Farmer milked cow. ");
		} catch (MilkOverflowError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
