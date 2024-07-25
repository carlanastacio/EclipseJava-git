import java.util.Scanner;

public class JavaArrays4 {

	
	 public static void main(String[] args) {
		 
		 //Arrays 
		 				// index[] -  0      1		2		3			4
		 String studentNames[] = {"Carl", "David", "Ace", "Aleney", "Bacnoni"};
		 				// value{} -  1		 2		3		4			5
		 // Re-write 
		 studentNames[1] = "Zeus";
		 
		 int numbers[] = {1,2,3,4,5,6,8,9,10}; 
		 
		 // Input Arrays
		 int evenNumbers[] = new int[10];

		 Scanner s = new Scanner(System.in);
		 String employeeNames[] = new String[20];
		 
		 // employeeNames[0] = s.nextLine();		 
		 // System.out.println("You are " + employeeNames[0]);
		 
		 
		 String emailIndex[] = {"carl1@gmail.com", "david2@gmail.com", "ace3@gmail.com", "aleney4@gmail.com", "bacnoni5@gmail.com"};
		 String usernameIndex[] = {"Carl_1", "David_2", "Ace_", "Aleney_4", "Bacnoni_5"};
		 String passwordIndex[] = {"carlpogi_1", "davidpogi_2", "acepogi_3", "aleneypogi_4", "bacnonipogi_5"};
		 
		 System.out.print("Input value 1 to 5: ");
		 int arrayInd = s.nextInt(); 
		 int arrayValue = arrayInd - 1;
		 
		 System.out.println();
		 System.out.println("Index Value	: " + arrayValue);
		 System.out.println("Arrays 		: " + arrayInd);
		 System.out.println("Email		: " + emailIndex[arrayValue]);
		 System.out.println("Username	: " + usernameIndex[arrayValue]);
		 System.out.println("Password	: " + passwordIndex[arrayValue]);

		 
	 }
}
