package A_Intro;

import java.util.Scanner;

public class A5_NestedForLoop {

	public static void main(String[] args) {

		// nested loop = a loop inside a loop
		
		Scanner scan = new Scanner(System.in);
		
		int rows, columns;
		String symbol = null;
		
		System.out.println("Enter number of rows: ");
		rows = scan.nextInt();
		
		System.out.println("Enter number of columns");
		columns = scan.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scan.next();
		
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scan.close();
	}

}
