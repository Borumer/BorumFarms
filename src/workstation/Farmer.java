package workstation;
import animals.Cow;
import farmerrors.MilkOverflowError;

public class Farmer {
	
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
		} catch (MilkOverflowError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
