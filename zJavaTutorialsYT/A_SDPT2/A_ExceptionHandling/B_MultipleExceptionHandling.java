package A_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B_MultipleExceptionHandling {

	public static void main(String[] args) {

		String names[] = { "SDPT", "David", "Alenere" };
		Scanner scan = new Scanner(System.in);

		int index = 0;
		for (int i = 0; i < names.length; i++) {
			index = i;
		}

		try {
			System.out.println("Choose index out of 0 to " + index);
			int x = scan.nextInt();
			System.out.println(names[x]);
		} catch (ArrayIndexOutOfBoundsException | InputMismatchException e2) {
			System.out.println("Something is wrong!");
		} 
		

		// ---------- OR ---------------

		/*
		 * 
		 * try { System.out.println("Choose index out of 0 to " + index); int x =
		 * scan.nextInt(); System.out.println(names[x]); }
		 * catch(ArrayIndexOutOfBoundsException aioobe) {
		 * System.out.println("Array out of bounds!"); } catch(InputMismatchException
		 * ime) { System.out.println("Input mismatch!"); }
		 * 
		 */

	}

}
