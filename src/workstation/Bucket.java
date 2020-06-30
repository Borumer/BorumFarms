package workstation;

import farm.MilkOverflowError;

/**
 * @author Varun Singh
 */
public class Bucket {
	/**
	 * Puts milk into this Bucket
	 * @param amountRequested the amount of milk in fluid ounces
	 * @throws MilkOverflowError if the bucket does not have enough capacity
	 */
	public void putMilk(double amountRequested) throws MilkOverflowError {
		if (amountRequested > 5.0) 
			throw new MilkOverflowError();
		else
			System.out.println("Bucket filled with " + amountRequested + " fl. oz.");
	}
}
