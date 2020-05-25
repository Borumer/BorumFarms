package driver;

import workstation.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.nio.file.*;

import life.animals.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FarmsSimulation extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public FarmsSimulation() {
		setTitle("Farm Simulation");
		setLookAndFeel();
		setSize(720, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
        JButton milk = new JButton("Milk the cow");
        JButton newFarmer = new JButton("Add new Farmer");
        JButton newFarmAnimal = new JButton("Add a new farm animal");
        
        JTextArea z = new JTextArea(4, 20);
        z.setLineWrap(true);
        
        JPanel endOfForm = new JPanel();
        JLabel thankYouMessage = new JLabel("Thank you for simulating this farm!", JLabel.RIGHT);
        endOfForm.add(thankYouMessage);
        
        add(milk);
        add(newFarmer);
        add(newFarmAnimal);
        add(new JLabel());

        add(z);
        
        add(new FreeSpacePanel());
        add(endOfForm);
//        getContentPane().validate();
//        getContentPane().repaint();
        setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Loading farmers...");
		Farmer joe = new Farmer();
		System.out.println("Loading animals...");
		Cow sally = new Cow();
		System.out.println("Loading tools and objects...");
		Bucket b = new Bucket();
		joe.fetchMilk(sally, b, 6.0);
		new FarmsSimulation();
		new GriddedFrame();
		new BorderedFrame();
		new BoxedFrame();
	}

}

@SuppressWarnings("serial")
class GriddedFrame extends JFrame {
	public GriddedFrame() {
		setTitle("Gridded Farm Simulation");
		setLookAndFeel();
		setSize(360, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(3, 6);
		setLayout(grid);
		
        JCheckBox s = new JCheckBox("Jumbo Size");
        JCheckBox t = new JCheckBox("Fish Taco Platter");
        
        ButtonGroup stuv = new ButtonGroup();
        JCheckBox a = new JCheckBox("Large");
        JCheckBox b = new JCheckBox("Medium");
        JCheckBox c = new JCheckBox("Small");
        stuv.add(a);
        stuv.add(b);
        stuv.add(c);
        
        
        add(s);
        add(t);
        add(a);
        add(b);
        add(c);
        
		setVisible(true);
	}
	
	public Insets getInsets() {
		Insets squeeze = new Insets(50, 50, 50, 50);
		return squeeze;
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
}

@SuppressWarnings("serial")
class BorderedFrame extends JFrame {
    public BorderedFrame() {
		setTitle("Bordered Frame");
		setLookAndFeel();
		setSize(360, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout borders = new BorderLayout();
		setLayout(borders);
    	JComboBox<String> family = new JComboBox<String>();
        family.addItem("Mate");
        family.addItem("Mate and two offspring");
        family.addItem("Mate and one offspring");
        family.addItem("One offspring (widowed)");
        family.addItem("Two offspring (widowed)");
        
        JComboBox<Double> weight = new JComboBox<Double>();
        weight.addItem(10.0);
        weight.addItem(20.0);
        weight.addItem(30.0);
        weight.addItem(40.0);
        weight.addItem(50.0);
        weight.setEditable(true);
        
        add(family, BorderLayout.NORTH);
        add(weight, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
}

@SuppressWarnings("serial")
class BoxedFrame extends JFrame {
	public BoxedFrame() {
		setTitle("Farm Boxed Layout");
		Utility.setLookAndFeel();
		setSize(300, 360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		BoxLayout boxes = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(boxes);
		
        JLabel typeLabel = new JLabel("Farm Animal: ", JLabel.RIGHT);
		JTextField farmAnType = new JTextField(20);
        String typeChoice = farmAnType.getText();
        farmAnType.setText("Cow");
        System.out.println(typeChoice);
        
        JTextArea originalOwners = new JTextArea(4, 20);
        
        JTextArea comments = new JTextArea(5, 10);
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        JScrollPane commentsScroll = new JScrollPane(comments, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
        pane.add(typeLabel);
        pane.add(farmAnType);
        pane.add(originalOwners);
		pane.add(commentsScroll);
		add(pane);
		setVisible(true);
	}
}

@SuppressWarnings("serial")
class FreeSpacePanel extends JPanel {
	JLabel spaceLabel = new JLabel("Disk space: ");
	JLabel space = new JLabel();
	
	public FreeSpacePanel() {
		super();
		add(spaceLabel);
		add(space);
		try {
			setValue();
		} catch (IOException ioe) {
			space.setText("Error");
		}
	}
	
	private final void setValue() throws IOException {
		// Get the current file storage pool
		Path current = Paths.get("");
		FileStore store = Files.getFileStore(current);
		// Find the free storage space
		long totalSpace = store.getTotalSpace();
		long freeSpace = store.getUsableSpace();
		// Get value as a two digit percentage
		double percent = (double) freeSpace / (double) totalSpace * 100;
		percent = (int) (percent * 100) / (double) 100;
		// Set the label's text
		space.setText(freeSpace + " free out of " + totalSpace + " (" + percent + "%)");
	}
}

class ImageComponent extends JComponent{
    private static final long serialVersionUID = 1L;
    private Image image;
    public ImageComponent(){
        try{
            File image2 = new File("images/cow.png");
            image = ImageIO.read(image2);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void paintComponent (Graphics g){
        if(image == null) return;

        g.drawImage(image, 50, 50, this);
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