package A_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_TutorialChallenge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int x = 0;

		do {
			try {
				System.out.print("Enter a number: ");
				x = scan.nextInt();
				flag = false;
			} catch (InputMismatchException ime) {
				System.out.println("Enter a number only!");
				scan.next();
			} finally {
				System.out.println("Correct answer: " + x);
	
			}
		} while (flag);

	}

}
