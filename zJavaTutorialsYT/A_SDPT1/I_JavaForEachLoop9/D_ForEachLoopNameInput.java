package I_JavaForEachLoop9;
import java.util.Scanner;

public class D_ForEachLoopNameInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = {"jonas", "ace", "carl"};

        System.out.print("Enter a name: ");
        String userInp = scan.nextLine().toLowerCase();

        boolean found = true; // Flag to track if the name is found

        for (String name : names) {
            if (userInp.equals(name)) {
                System.out.println("Match found: " + name);
                found = false;
                break; // Exit the loop once a match is found
            }
        }

        if (found) {
            System.out.println("Invalid"); // Print "Invalid" if the name is not found
        }

        scan.close();
    }
}
