package life.animals;

import workstation.Bucket;

import farmerrors.MilkOverflowError;

public interface Milkable {
	public void giveMilk(Bucket container, double requestAmount) throws MilkOverflowError;
}
