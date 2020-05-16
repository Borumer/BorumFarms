package life;

abstract public class Organism {
	abstract public void exhibitMetabolism();
	
	abstract public void grow();
	
	public void respondToStimulus() {
		System.out.println("Responding to stimulus...");
	}
}
