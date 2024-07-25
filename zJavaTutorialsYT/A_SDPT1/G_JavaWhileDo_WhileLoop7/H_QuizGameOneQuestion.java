package G_JavaWhileDo_WhileLoop7;

import java.util.Scanner;

public class H_QuizGameOneQuestion{
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    		
    	// Datas
    		String[] question = {
    				"(Is a Dog a Flying Animal?)",
    				"(Is a Dog a Living Creature?)", 
    				"(Is a Dog a Sea Creature?)"
    		};
    		String[] answers = {
    				"no", 
    				"yes", 
    				"no"
    		};
    		String[] ansResult = {"That is Correct", "That is Wrong"};
    		String tagline = ("----------------------------");
    	
    	// controls
    		int maxHealth = 100;
    		int min50Health = 50;
    		int index = 0;
    		
    		System.out.print("Press ENTER to start.");
    		String enter = scan.nextLine();
    		System.out.println(tagline);

    		if(enter.equalsIgnoreCase("")) {
    			System.out.println("	Entered\n----------------------------");
        		System.out.println("Answer with YES or NO only.");
        		System.out.println(tagline);

    			while(index < question.length) {
    				System.out.println(question[index]);
    				String userAns = scan.nextLine().toLowerCase();
    	    		System.out.println(tagline);

    				
    				if(userAns.equals(answers[index])) {
    					System.out.println(ansResult[0]);

    				} else {
    					System.out.println(ansResult[1]);
    					maxHealth -= min50Health;
    				}
    				
    				System.out.println("Current Health: " + maxHealth);
    	    		System.out.println(tagline);

    				// If it reaches 0 it will game oever stop program
    				if(maxHealth == 0) {
    					System.out.println("Game Over!");
    		    		System.out.println(tagline);
    		    		maxHealth -= 0;
    		    		System.exit(maxHealth);
    				}
    				
    			index++;
    			}
    			
    				if (maxHealth != 0) {
    					System.out.println("You Won!");
    		    		System.out.println(tagline);
    				}
    		} else {
    			System.out.println("Invalid Input");
    			System.exit(0);
    		}
    }
}