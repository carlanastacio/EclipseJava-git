package A1_JavaGUIintro;

import javax.swing.JOptionPane;


public class JavaGUIintro {

	public static void main(String[] args) {
		
		// creating a instantce of nameinoutmodifier 
		NameInputModifier nameObj = new NameInputModifier();
		
		String fName = JOptionPane.showInputDialog("Enter first name");
//		JOptionPane.showMessageDialog(null, "Hello, " + fName);
		String lName = JOptionPane.showInputDialog("Enter last name");
		
		// using obj to instantiate
		nameObj.setFULLname2(fName, lName);
		JOptionPane.showMessageDialog(null, "Using obj - "+ nameObj.fullname2);
		
		
		// using static class method to instantiate
		NameInputModifier.setFULLname(fName, lName);
		JOptionPane.showMessageDialog(null, " using static - " +  NameInputModifier.fullname);
	
		JOptionPane.showMessageDialog(null, "Addition - Enter 2 Variables");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("First Variable"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Second Variable"));

		AddModifierMethod addObj = new AddModifierMethod();
		addObj.add(num1, num2);
		JOptionPane.showMessageDialog(null, "Sum is "+ addObj.combined);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your age is " + age);
				
		
		
	}

}
