import java.util.Scanner;

public class JavaConditionalStatement5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// if statement
		
		/*
		int age = 19;
		
		if (age > 18) {
			System.out.println("True if this shows, false if not");
		}
		
		*/
		
		/*
		
		// If else If else statement
		int age = 17;
		
		if (age >= 18) {
			System.out.print("You have access");
		} else if (age >= 13) {
			System.out.print("You need parents permission");
		} else {
			System.out.print("Denied");
		}
		
		*/
		
		/* 
		 		// one liner if else statement

		
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		
		if (age >= 18) System.out.println("You are over 18");
		else System.out.println("You are teenager");
		
		scan.close();

		*/
		
		// nested conditional statement
		
		/*
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		boolean isVerified = true;
		boolean isnotVerified = true;

		
		if (age >= 0) {
			System.out.println("Access Granted");
			
			if  (age >= 18) {
				System.out.println("Qualified");
			} else {
				System.out.println("Not Qualified");
			}
		} 
		
		*/
		
		// equals function
		
		/* 
		String greet = scan.nextLine();
		
		// .equals strict to the case
		// .equalsIgnoreCase not case sensitive
		if (greet.equalsIgnoreCase("Hello")) {
			System.out.println("Hi");
		}
		*/
		
		// logical operators
		
		/* boolean hasBallpen = true;
		boolean hasPen = false;
		
		if(hasPen || hasBallpen) {
			System.out.println("Go in");
		} else {
			System.out.println("Go home");
		} */
		
		// verified
		
		/* 
		 
		int age = 18;
		 
		boolean isVerified = true;
		
		if(age >= 18 && isVerified) {
			System.out.println("You have access and verified");
		} else if(age >= 18 && !isVerified) {
			System.out.println("You have acess but not verified");
		} else {
			System.out.println("Access Denied");
		}
		
		*/
		
		// not verified
		
		/*
		int age = 18;
		boolean isVerified = false;
		
		if(age >= 18 && isVerified) {
			System.out.println("You have access and verified");
		} else if(age >= 18 && !isVerified) {
			System.out.println("You have acess but not verified");
		} else {
			System.out.println("Access Denied");
		}
		*/
		
		// Grade Average Program
		
		System.out.print("Input first Grade: ");
		double firstGrade = scan.nextDouble();
		System.out.print("Input second Grade: ");
		double secondGrade = scan.nextDouble();
		System.out.print("Input third Grade: ");
		double thirdGrade = scan.nextDouble();
		System.out.print("Input fourt Grade: ");
		double fourthGrade = scan.nextDouble();

		double aveGrade = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
		
		System.out.println();
		System.out.print(aveGrade + " is ");
		
		if (aveGrade > 100) {
			System.out.println("Invalid Input");
		} else if (aveGrade >= 98 || aveGrade >= 100) {
			System.out.println("With Highest Honors");
		} else if (aveGrade >= 95 || aveGrade >= 97.99) {
			System.out.println("With High Honors");
		} else if (aveGrade >= 90 || aveGrade >= 94.99) {
			System.out.println("With Honors");
		} else if (aveGrade > 75 || aveGrade >= 89.99) {
			System.out.println("Passed");
		} else {
			System.out.print("Failed");
		}
		
		scan.close();
	}
}