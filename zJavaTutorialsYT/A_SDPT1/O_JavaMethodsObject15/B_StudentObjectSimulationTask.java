package O_JavaMethodsObject15;

import java.util.Scanner;

public class B_StudentObjectSimulationTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		 
		System.out.println("Enter first name");
		String fN = scan.nextLine();
		
		System.out.println("Enter last name");
		String lN = scan.nextLine();
		
		System.out.println("Enter course");
		String course = scan.nextLine();
		
		System.out.println("Enter year level");
		int year = scan.nextInt();
		
		System.out.println("Enter section");
		String section = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Enter midterm grade");
		int midGr = scan.nextInt();
		
		System.out.println("Enter final grade");
		int finalGr = scan.nextInt(); 
		
		BA_ObjectMethodsConstructors omc1 = new BA_ObjectMethodsConstructors(fN, lN, course, section, year, midGr, finalGr);

	 	*/

		BA_ObjectMethodsConstructors omc2 = new BA_ObjectMethodsConstructors("Carl", "Anastacio", "CS-ML", "B", 2025, 85,90);
		
		omc2.introduceSelf();
		omc2.evalGrade();
		
		scan.close();
	}

}
