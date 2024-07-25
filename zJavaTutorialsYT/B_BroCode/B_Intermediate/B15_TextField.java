package B_Intermediate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class B15_TextField {

	public static void main(String[] args) {
		
		// JTextField = A GUI textbox component that can be used to add, set, or get text

		new MyFrame2();
	

	}

}

class MyFrame2 extends JFrame implements ActionListener {

	JButton jButton;
	JTextField jTextField;
	
	MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		jButton = new JButton("Submit");
		jButton.addActionListener(this);
		
		jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(250, 30));
		jTextField.setFont(new Font("Consolas", Font.PLAIN, 25));
		jTextField.setForeground(Color.BLUE);
		jTextField.setBackground(Color.WHITE);
		jTextField.setCaretColor(Color.BLUE);
		
		
		this.add(jButton);
		this.add(jTextField); // we should tho this before pack();
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==jButton) {
		jButton.setEnabled(false);
		jTextField.setEditable(false);		}
	}
	
}