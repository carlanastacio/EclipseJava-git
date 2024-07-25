package A_Intro;

import java.util.Scanner;

public class A3_WhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		String section = "";

		// while loop = executes a block of code as long as a it's condition remains true
		
		while(name.isBlank()) {
			System.out.print("Enter name: ");
			name = scan.nextLine();
		}
		

		
		// do loop = we perform the block of code atleast once and then we check the condition after 
		
		do {
			System.out.print("Enter section: ");
			section = scan.nextLine();
		} while(section.isBlank()); 
		
		System.out.println("Section: " + section);
		System.out.println("Hello: " + name);
		
	}

}
