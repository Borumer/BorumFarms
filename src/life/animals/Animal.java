package life.animals;

import life.Organism;

public abstract class Animal extends Organism {
	private String sciName;
	private String comName;
	
	public Animal(String sn) {
		sciName = sn;
		comName = "";
	}
	
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
		
	}
	
	public void grow() {
		
	}
}
