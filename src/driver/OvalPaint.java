package driver;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OvalPaint extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
	    g.setColor(Color.orange);
	    g.fillRect(0, 0, getWidth(), getHeight());
	    g.setColor(Color.red);
	    g.fillOval(getWidth()/4, getHeight()/4, 
			getWidth()/2, getHeight()/2);
	  }

	  public static void main(String args[]) {
	    JFrame frame = new JFrame("OvalPaint");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new FlowLayout());

	    OvalPaint panel = new OvalPaint();
	    
	    frame.add(panel);

	    frame.setSize(300, 200);
	    frame.setVisible(true);
	  }
}