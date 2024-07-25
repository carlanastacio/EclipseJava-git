package V_ArrayOfObjects22;

import java.util.Scanner;

public class C_StudentRegSimChallenge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String fName, lName, course = null;
		int year  = 0;
		int num = 0;
		char section = 0;
		
		print("Enter Number of Students to be Registered : ");
		num = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		CB_EncapData students[] = new CB_EncapData[num];	

		for (int i = 0; i < num; i++) {	

			System.out.println("Student #" + (i+1));

            print("Enter First Name: ");
            fName = scan.nextLine().trim();
            
            print("Enter Last Name: ");
            lName = scan.nextLine().trim();
            
            print("Enter Year: ");
            year = scan.nextInt();
            scan.nextLine(); 

            print("Enter Course: ");
            course = scan.nextLine().trim();
            
            print("Enter Section: ");
            String sectionInput = scan.nextLine().trim();
            section = sectionInput.charAt(0);
			
			students[i] = new CB_EncapData(fName, lName, year, course, section);
			System.out.println();
			System.out.println();
			
		}
		
		 for (int i = 0; i < num; i++) {
	            students[i].getAllDetails(); 
		 }
		 
		scan.close();
	}

	static void print(String word) {
		System.out.print(word);
	}
}
