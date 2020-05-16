package life;

public class Human extends Organism {
	int height;
	int age;
	
	public Human(int h, int a) {
		height = h;
		age = a;
	}
	
	public void exhibitMetabolism() {
		System.out.println("Breathing in oxygen");
	}
	
	public void grow() {
		
	}
}
