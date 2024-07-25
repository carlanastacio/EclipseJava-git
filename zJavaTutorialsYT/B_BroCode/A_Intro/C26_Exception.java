package A_Intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C26_Exception {

	public static void main(String[] args) {
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scan.nextInt();
			
			System.out.println("Enter a whole number to divide by: ");
			int y = scan.nextInt();
			
			int z = x/y;
			
			System.out.println("Results: " + z);
		}
		// when u divide 0 
		catch(ArithmeticException ae) {
			System.out.println("You cant divide by 0, idiot!");
		}
		// when u input a string on a int scanner
		catch(InputMismatchException ime) {
			System.out.println("Please enter a number, omfg!");
		}
		// catcch all exception but its good to practice individual handle and this is a last resort if u forget it
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		// good use of this is to close any open scanners 
		finally {
			scan.close();
		}
		
	}

}
