package workstation;

import farm.MilkOverflowError;

public class Bucket {
	/**
	 * 
	 * @param amountRequested
	 * @throws MilkOverflowError
	 */
	public void putMilk(double amountRequested) throws MilkOverflowError {
		if (amountRequested > 5.0) 
			throw new MilkOverflowError();
		else
			System.out.println("Bucket filled with " + amountRequested + " fl. oz.");
	}
}
