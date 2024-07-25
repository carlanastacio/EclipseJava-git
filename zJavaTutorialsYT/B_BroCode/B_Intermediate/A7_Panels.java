package B_Intermediate;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A7_Panels {
	
	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon image = new ImageIcon("like.png");
		
		JLabel label = new JLabel();
		label.setText("HI!");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(100, 100, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		greenPanel.add(label);
		
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}
