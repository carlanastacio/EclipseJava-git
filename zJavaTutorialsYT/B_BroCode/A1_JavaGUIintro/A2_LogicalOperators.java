package A1_JavaGUIintro;

import java.util.Scanner;

public class A2_LogicalOperators {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		//
		//						&& = (AND) both conditions must be true
		// 						|| = (OR) either condition must be true
		//						! = (NOT) reverses boolean value of condition
		
		Scanner scan = new Scanner(System.in);

		int temp = 15;
		
		if(temp > 30) {
			System.out.println("It is hot outside");
		} else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It is cold outside");
		}
		
		System.out.println();
		
		System.out.println("Press Q or q to quit.");
		String response = scan.next();
		
		if(!response.equals("q") && response.equals("Q")) {
			System.out.println("Quitted the game");
		} else {
			System.out.println("Still playing");
		}
	
	}

}
