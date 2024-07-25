package J_Java2DArraysNestedFor10;

import java.util.Scanner;

public class RandomOneQuestionQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String question[] = {"Am i handsome?", "Am i ugly?"};
		
		String answer[] = {"yes", "no"};
		
		String result[] = {"That is correct", "That is wrong"};
		
		int maxHealth = 100;
		int minHealth = 50;
		int index = 0;
		
		System.out.print("Press Enter to Start");
		String enter = scan.nextLine();
		
		if(enter.equalsIgnoreCase("")) {
			System.out.println("Entered");
			System.out.println("Yes or No");

			while(index < question.length) {
				System.out.println(question[index]);
				String userAns = scan.nextLine().toLowerCase();
				
					if(userAns.equalsIgnoreCase("yes") || userAns.equalsIgnoreCase("no")) {
						if(userAns.equals(answer[index])) {
							System.out.println(result[0]);
							
						} else {
							System.out.println(result[1]);
							maxHealth -= minHealth;
						}
						index++;
					} else {
						System.out.println("Input Yes or No only!");
						break;
					}
					
			if(maxHealth == 0) {
				System.out.println("You Lose");
			}
			
			
			if(userAns.equalsIgnoreCase("yes") || userAns.equalsIgnoreCase("no")) {
				
					System.out.println("Curreny health : " + maxHealth);
				}		
			}
			
		} else {
			System.out.println("Just press Enter to start");
			System.exit(0);
		}
		
		if(maxHealth != 0) {
			System.out.println("You Won");
		}
	}

}
