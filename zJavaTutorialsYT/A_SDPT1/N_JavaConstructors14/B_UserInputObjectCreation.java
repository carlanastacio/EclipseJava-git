package N_JavaConstructors14;

import java.util.Scanner;

public class B_UserInputObjectCreation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Product");
		String product = scan.nextLine();
		System.out.println("Enter Price");
		int showPrice = scan.nextInt();
		
		B_Product p = new B_Product(product, showPrice);
		
		println(p.product, p.showPrice);
			
		
		scan.close();
	}
	
	static void println(String product, int showPrice) {
		System.out.println("Product:	" + product  + " \nPrice:		" + showPrice + " Php");
	}

}
