package life.animals;

import life.Organism;

public abstract class Animal extends Organism {
	private String sciName;
	private String comName;
	
	/**
	 * Initializes a new Animal object with its scientific name.
	 * Used when a common name doesn't exist
	*/
	public Animal(String sn) {
		sciName = sn;
		comName = "";
	}
	
	/**
	 * Initializes a new Animal object with its scientific and common name
	*/
	public Animal(String sn, String cn) {
		sciName = sn;
		comName = cn;
	}
	
	public String getSciName() {
		return sciName;
	}

	public void setSciName(String sciName) {
		this.sciName = sciName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}
	
	public String toString() {
		String str = "Scientific name: " + sciName
				+ (!comName.isEmpty() ? "Common name: " + comName : "");
		return str;
	}
	
	public void eat() {
		System.out.println("Eating grass");
	}
	
	public void eat(String food) {
		System.out.println("Eating " + food);
	}
	
	public void exhibitMetabolism() {
		System.out.println("Exhibiting metabolism...");
	}
	
	public void grow() {
		System.out.println("Growing...");
	}
}
