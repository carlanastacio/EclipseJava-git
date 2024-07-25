package H_JavaForLoop8;

import java.util.Scanner;

public class E_AuthenticationSimulation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] username = {"David", "Nico", "Alden", "Manny"};
		String[] password = {"david123", "nico123", "alden123", "manny123"};
		
		System.out.print("Enter Username : ");
		String inpUser = scan.nextLine();
		System.out.print("Enter Password : ");
		String inpPass = scan.nextLine().toLowerCase();
		boolean accFound = false;
		
			for(int i = 0; i < username.length && i < password.length; i++) {
				
					if (inpUser.equals(username[i]) && inpPass.equals(password[i])) {
						System.out.println();
						System.out.println("Welcome, " + inpUser + ".");
						accFound = true;
						break;
						}
		            }
				if (!accFound) {
                System.out.println("Account not Found");
		}
		scan.close();
	}

}
