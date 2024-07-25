package G_JavaWhileDo_WhileLoop7;

import java.util.Scanner;

public class I_SDPTQuizTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		String tagline = "---------------------------";
		
		String[] question = {
				"Is a Dog a Living Creature?",
				"Is a Dog a Living Creature?",
				"Is a Dog a Living Creature?"
				};
		int maxHealth = 100;
		int minHealth = 25;
		
		System.out.print("    Press Enter to Start." + "\n" + tagline + "\nInput	: ");
		String userInp = scan.nextLine().toLowerCase();
		System.out.println(tagline);
		System.out.println("   Answer with Yes or No");
		System.out.println(tagline);

			if (userInp.equals("")) {
				while(i < 3) {
					System.out.println(question[i]);
					System.out.print("Input	: ");
					userInp = scan.nextLine().toLowerCase();
					
						if (userInp.equals("yes")) {
							System.out.println(tagline);
							System.out.println("	Correct!");
							System.out.println("	You Won!");
							System.out.println(tagline);
							System.out.println("Current Health : " + maxHealth);
							System.out.println(tagline);
							System.exit(0);
						} else {
							System.out.println(tagline);
							System.out.println("Wrong!");
							System.out.println(tagline);
							maxHealth -= minHealth; 
							
							if(i == 2) {
								System.out.println("Current Health : " + maxHealth);
								System.out.println("	You Lost!");
								System.out.println(tagline);
								
							}
							
						}
				i++;
				}
			} else {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		scan.close();
	}

}
