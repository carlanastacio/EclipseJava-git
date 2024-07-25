package B_Intermediate;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class B13_OpenNewGUIWindow {

	public static void main(String[] args) {
		// Create an instance of LaunchPage
		LaunchPage launchPage = new LaunchPage();
	}
}

class LaunchPage implements ActionListener {

	// Create a JFrame and a JButton
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");

	LaunchPage() {
		// Set the position and size of the button
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false); // Remove focus from the button to remove the border around the text
		myButton.addActionListener(this); // Add an action listener to the button

		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the frame is closed
		frame.setSize(420, 420); // Set the size of the frame
		frame.setLayout(null); // Use no layout manager
		frame.setVisible(true); // Make the frame visible

		// Add the button to the frame
		frame.add(myButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Check if the source of the event is the button
		if (e.getSource() == myButton) {
			frame.dispose(); // Close the current frame (LaunchPage)
			NewWindow myWindow = new NewWindow(); // Create an instance of NewWindow
		}
	}
}

class NewWindow {

	// Create a JFrame and a JLabel
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");

	NewWindow() {
		// Set the position and size of the label
		label.setBounds(0, 0, 100, 50);
		label.setFont(new Font(null, Font.BOLD, 25)); // Set the font of the label

		// Add the label to the frame
		frame.add(label);

		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the frame is closed
		frame.setSize(420, 420); // Set the size of the frame
		frame.setLayout(null); // Use no layout manager
		frame.setVisible(true); // Make the frame visible
	}
}
