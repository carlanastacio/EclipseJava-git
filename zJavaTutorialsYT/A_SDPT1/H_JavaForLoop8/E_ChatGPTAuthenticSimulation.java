package H_JavaForLoop8;

import java.util.Scanner;

public class E_ChatGPTAuthenticSimulation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] username = {"David", "Nico", "Alden", "Manny"};
        String[] password = {"david123", "nico123", "alden123", "manny123"};

        System.out.print("Enter Username : ");
        String inpUser = scan.nextLine();

        // Check if the input contains only text (no numbers or spaces)
        if (inpUser.matches("[a-zA-Z]+")) {
            System.out.print("Enter Password : ");
            String inpPass = scan.nextLine().toLowerCase();

            // Search for the username and password in the arrays
            boolean accountFound = false;
            for (int i = 0; i < username.length; i++) {
                if (inpUser.equals(username[i]) && inpPass.equals(password[i])) {
                    System.out.println("Account Found");
                    accountFound = true;
                    break; // Exit the loop once the account is found
                }
            }
            // If account not found, print message
            if (!accountFound) {
                System.out.println("Account not Found");
            }
        } else {
            // If input contains numbers or spaces, print message and exit program
            System.out.println("Invalid input. Username must contain only letters.");
            System.exit(0);
        }

        scan.close();
    }
}
