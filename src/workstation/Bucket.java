package workstation;

import farmerrors.MilkOverflowError;

public class Bucket {
	/**
	 * 
	 * @param amountRequested
	 * @throws MilkOverflowError
	 */
	public void putMilk(double amountRequested) throws MilkOverflowError {
		if (amountRequested > 5.0) 
			throw new MilkOverflowError();
	}
}
