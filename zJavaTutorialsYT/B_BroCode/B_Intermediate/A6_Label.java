package B_Intermediate;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class A6_Label {

	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("rainbow.jpg");
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Bro i code fr!"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text left center right of the image icon
		label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, bottom of imageicon
		label.setForeground(Color.GREEN); // set font color of text
		label.setFont(new Font("MV Boli", Font.ITALIC, 70)); // set font of text 
		label.setIconTextGap(-100); // set gap to text image 
		label.setBackground(Color.WHITE); // set background coolr
		label.setOpaque(true); // DISPLAY backgroudn cover 
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within the label
		label.setHorizontalAlignment(JLabel.CENTER); // this will set horizontal position of icon + text within label
//		label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setBackground(Color.WHITE);
//		frame.setLayout(null);
		frame.add(label);
		frame.pack();
	}

}
