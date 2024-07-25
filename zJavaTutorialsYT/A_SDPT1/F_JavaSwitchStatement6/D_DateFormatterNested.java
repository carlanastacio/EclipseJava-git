package F_JavaSwitchStatement6;

import java.util.Scanner;

public class D_DateFormatterNested {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("	\"Date Formatter\" \nFollow this Format(dd/mm/yyyy).");
		System.out.println("----------------------------------");
		System.out.print("Input Date(1-31)	: ");
		int inpDate = scan.nextInt();
		
		
		String monthName = "";
		
		// switch inside the nested if else statement
		if (inpDate <= 31 && inpDate >= 1) {
			
			System.out.print("Input Month(1-12)	: ");
			int inpMonth = scan.nextInt();
			
				switch(inpMonth) {
					case 1:
						monthName = "January" ;
					break;
					case 2:
						monthName = "Febraury";
					break;
					case 3:
						monthName = "March";
					break;
					case 4:
						monthName = "April";
					break;
					case 5:
						monthName = "May";
					break;
					case 6:
						monthName = "June";
					break;
					case 7:
						monthName = "July";
					break;
					case 8:
						monthName = "August";
					break;
					case 9:
						monthName = "September";
					break;
					case 10:
						monthName = "October";
					break;
					case 11:
						monthName = "November";
					break;
					case 12:
						monthName = "December";
					break;
					default:
						System.out.println("----------------------------------");
						System.out.println("Invalid Input. Follow (1-12) Only!");
						System.out.println("----------------------------------");

						System.exit(0);
				}
			
		} else {
				System.out.println("----------------------------------");
				System.out.println("Invalid Input! Follow (1-31) Only.");
				System.out.println("----------------------------------");
				System.exit(0);
		}
		
		System.out.print("Input Year		: ");
		int inpYear = scan.nextInt();
		
		// output 
		System.out.println("----------------------------------");
		System.out.print("You're Birthdate is ");
		System.out.print(monthName + ", " + inpDate + " " + inpYear);
		System.out.println();
		System.out.println("----------------------------------");

		
		scan.close();
	}
}