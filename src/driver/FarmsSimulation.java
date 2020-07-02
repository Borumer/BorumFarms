package driver;

import workstation.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import farm.Farm;

import life.animals.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class FarmsSimulation extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public FarmsSimulation() {
		setTitle("Farm Simulation");
		Utility.setLookAndFeel();
		setSize(720, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
        JButton milk = new JButton("Milk the cow");
        JButton newFarmer = new JButton("Add new Farmer");
        JButton newFarmAnimal = new JButton("Add a new farm animal");
        
        add(milk);
        add(newFarmer);
        add(newFarmAnimal);
       
        int originalCowWidth = 960;
        int originalCowHeight = 534;
        int shrinkFactor = 4;
        JImageComponent cow = new JImageComponent(new File("images/cow.png"), originalCowWidth / shrinkFactor, originalCowHeight / shrinkFactor);
        add(cow);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("Loading farmers...");
		Farmer joe = new Farmer();
		System.out.println("Loading animals...");
		Cow sally = new Cow();
		Cow george = new Cow();
		System.out.println("Loading tools and objects...");
		Bucket b = new Bucket();
		System.out.println(Cow.getCowCount());
		Farm f = new Farm();
		f.getCows().add(sally);
		f.getCows().add(george);
		//joe.fetchMilk(sally, b, 6.0);
		FarmsSimulation sim = new FarmsSimulation();
	}

}

class JImageComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    private Image image;
    private int newWidth;
    private int newHeight;
    
    public JImageComponent(File f, int nWidth, int nHeight) {
    	super();
        try {
        	setPreferredSize(new Dimension(nWidth, nHeight));
        	System.out.println("reading file...");
            image = ImageIO.read(f);
            System.out.println("file read!");
        } catch (IOException e){
            e.printStackTrace();
        }
        newWidth = nWidth;
        newHeight = nHeight;
    }
    
    public void paintComponent (Graphics g){
    	super.paintComponent(g);
        if(image == null) return;
        image = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        g.drawImage(image, 0, 0, this);
    }
    
    public Image getImage() {
    	return image;
    }
}

class Utility {
	public static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
}