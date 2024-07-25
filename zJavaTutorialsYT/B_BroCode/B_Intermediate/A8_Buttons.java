package B_Intermediate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class A8_Buttons {

	public static void main(String[] args) {
		// JButton = a button that performs an action when clicked on
		
		new MyFrame();
		

	}

}

class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	MyFrame() {
		
		ImageIcon icon = new ImageIcon("like.png");
		
		ImageIcon icon2 = new ImageIcon("like.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
        
        Image scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		// or rekove implements and do this 
		//	button.addActionListener(e -> System.out.println("Poop");
		button.setText("I am a button!");
		button.setFocusable(false); // removes annoying box in the text
		button.setIcon(scaledIcon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(5);
		button.setForeground(Color.green);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createLoweredBevelBorder());
//		button.setEnabled(false);
		
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of an application
        this.setResizable(true); // prevents this from being resized
        this.setSize(500, 500); // sets x and y dimension
        this.setVisible(true); // set make this visible
        this.add(button);
        this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Poop");
			// button.setEnabled(false);
			label.setVisible(true);
			
		}
	}
	
}