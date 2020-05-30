package farm;

import java.util.ArrayList;

import life.animals.*;

public class Farm {
	private ArrayList<Cow> cows;
	private ArrayList<Chicken> chickens;
	private ArrayList<Pig> pigs;
	private ArrayList<Sheep> sheeps;
	
	public Farm() {
		cows = new ArrayList<Cow>();
		chickens = new ArrayList<Chicken>();
		pigs = new ArrayList<Pig>();
		sheeps = new ArrayList<Sheep>();
	}
	
	public Farm(ArrayList<Cow> co, ArrayList<Chicken> ch, ArrayList<Pig> pi, ArrayList<Sheep> sh) {
		cows = co;
		chickens = ch;
		pigs = pi;
		sheeps = sh;
	}
	
	public ArrayList<Cow> getCows() {
		return cows;
	}
	
	public ArrayList<Chicken> getChickens() {
		return chickens;
	}
	
	public ArrayList<Pig> getPigs() {
		return pigs;
	}
	
	public ArrayList<Sheep> getSheeps() {
		return sheeps;
	}
}
