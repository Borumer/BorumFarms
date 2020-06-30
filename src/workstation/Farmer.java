package workstation;
import farm.MilkOverflowError;
import life.animals.Cow;

public class Farmer {
	
	public Farmer() {
		
	}
	
	/**
	 * Precondition: Farmer owns bucket and cow
	 * Postcondition: Milk transferred from cow to farmer
	 * @param cow the cow that will give the milk
	 * @param bucket the destination container of the milk
	 * @param amountOfMilk the volume of milk in fl. oz. 
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
