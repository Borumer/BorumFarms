package driver;

import animals.*;
import workstation.*;

import javax.swing.*;

public class FarmsSimulation extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public FarmsSimulation() {
		setTitle("Main Frame");
		setSize(320, 290);
		setLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FarmsSimulation();
		Farmer joe = new Farmer();
		Cow sally = new Cow();
		Bucket b = new Bucket();
		joe.fetchMilk(sally, b, 50.0);
	}

}
