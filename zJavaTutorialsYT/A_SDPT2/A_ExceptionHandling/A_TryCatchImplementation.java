package A_ExceptionHandling;

import java.util.Scanner;

public class A_TryCatchImplementation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		try {
			System.out.print("Enter Number: ");
			int x = scan.nextInt(); // Ipasok lang kung ano nag nagerror
		} catch(Exception e) {
			System.out.println("Datatype Error!");
		} finally {
			scan.close();
		}
		
		
	}

}
