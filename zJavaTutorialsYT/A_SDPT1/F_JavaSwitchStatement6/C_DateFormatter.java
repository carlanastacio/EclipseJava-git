package F_JavaSwitchStatement6;

import java.util.Scanner;

public class C_DateFormatter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// intro of the program
		System.out.println("Date Formatter \nFollow this format(mm/dd/yyyy).");
		
		// Month
		System.out.print("Input Month: ");
		int inpMonth = scan.nextInt();
		String monthName = "";

	
		switch(inpMonth) {
			case 1:
				monthName = "January";
			//	System.out.print(firstM);
			break;
			case 2:
				monthName = "Febraury";
			//	System.out.print(secondM);
			break;
			case 3:
				monthName = "March";
			//	System.out.print(thirdM);
			break;
			case 4:
				monthName = "April";
			//	System.out.print(fourthM);
			break;
			case 5:
				monthName = "May";
			//	System.out.print(fifthM);
			break;
			case 6:
				monthName = "June";
			//	System.out.print(sixthM);
			break;
			case 7:
				monthName = "July";
			//	System.out.print(seventhM);
			break;
			case 8:
				monthName = "August";
			//	System.out.println(eighthM);
			break;
			case 9:
				monthName = "September";
			//	System.out.print(ninthM);
			break;
			case 10:
				monthName = "October";
			//	System.out.println(tenthM);
			break;
			case 11:
				monthName = "Novemebr";
			//	System.out.print(eleventhM);
			break;
			case 12:
				monthName = "December";
			//	System.out.print(twelvethM);
			break;
			default:
				System.out.println("Invalid Input for Month. Follow 0-12 Only");
				System.exit(0);
				System.out.println();

		}
		
		
		// Check Date if Correct
		System.out.print("Input Date: ");
		int inpDate = scan.nextInt();
		
		
		if (inpDate <= 31 && inpDate > -0) {
			int correctDate = inpDate;
		} else {
			System.out.println("Wrong Input for Date. Follow 01-31 Only!");
			System.exit(0);
			System.out.println();

		}
		
		
		// Year
		System.out.print("Input Year: ");
		int inpYear = scan.nextInt();
		System.out.println();
		
		// Output All
		System.out.print(monthName + ", " + inpDate + " " + inpYear);
	
		scan.close();
	}
}
