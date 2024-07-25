package B_Intermediate;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class A5_GUIMyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	A5_GUIMyFrame() {
		
		this.setTitle("JFrame goes here!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of an application
        this.setResizable(true); // prevents this from being resized
        this.setSize(500, 500); // sets x and y dimension
        this.setVisible(true); // set make this visible
        
        // Path to your icon image
        ImageIcon image = new ImageIcon("/Users/og/studyOG/zIconLogos/pngegg.png");
        this.setIconImage(image.getImage()); // change icon of this
        
        // Set background color
        this.getContentPane().setBackground(new Color(235, 255, 255)); // change bg color
	
	}

}
