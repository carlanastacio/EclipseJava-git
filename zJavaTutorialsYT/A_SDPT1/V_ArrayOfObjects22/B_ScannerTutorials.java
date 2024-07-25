package V_ArrayOfObjects22;

import java.util.Scanner;

public class B_ScannerTutorials {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Num: ");
		int x = scan.nextInt(); // pag may number or digits na hiningi dapat cleclear out natin sya  using nextLne
		scan.nextLine();
		
		// di maka input 
		System.out.print("Enter First  Name: ");
		String fname = scan.nextLine();
		
		// getting char using nextLine
		// for exmaple we input "hello" - h is at index 0 so its H 
		System.out.print("Enter Char:" );
		char c = scan.nextLine().charAt(0);
		
		System.out.println(c + x + fname);
		
		
	}

}
