package B_Intermediate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class B14_JOptionPane {

	public static void main(String[] args) {
		//JOptionPane = pop up a standard dialog box that prompts users for a value 
		//				or informs them of something.
				
//		JOptionPane.showMessageDialog(null, "This is a useless info", "Title", JOptionPane.PLAIN_MESSAGE); // just a text a
//		JOptionPane.showMessageDialog(null, "This is a useless info", "Title", JOptionPane.INFORMATION_MESSAGE); // has a i con
//		JOptionPane.showMessageDialog(null, "This is a useless info", "Title", JOptionPane.QUESTION_MESSAGE); // this has a question mark icon
/*		while(true) {
		JOptionPane.showMessageDialog(null, "This is a useless info", "Title", JOptionPane.WARNING_MESSAGE); // warning message has ! marked // virus shits
		} */
//		JOptionPane.showMessageDialog(null, "This is a useless info", "Title", JOptionPane.ERROR_MESSAGE); // error message has a red ! /// call tech support

		/*
		// you can also store it using this bitch
		int answer = JOptionPane.showConfirmDialog(null, "bro, do you code?", "Huh?", JOptionPane.YES_NO_CANCEL_OPTION);
		// prints a fuck 0 or 1
		System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you code?", "Huh?", JOptionPane.YES_NO_CANCEL_OPTION)); // stores a 0 or 1 or -1 depends
		*/
		// we can also store some strings
//		String name = JOptionPane.showInputDialog("What is your name!?");
		
		
		// diy option pane
		String responses[] = {"no, your aswesome", "thanks", "blush"};
		ImageIcon icon = new ImageIcon("like.png");
		
		JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	
		
	}

}
