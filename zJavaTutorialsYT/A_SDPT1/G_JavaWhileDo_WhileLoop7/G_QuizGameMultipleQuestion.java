package G_JavaWhileDo_WhileLoop7;

import java.util.Scanner;

public class G_QuizGameMultipleQuestion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Data 
        String[] answersRes = {"That is Correct", "That is Wrong"};
        
        String[] questions = { 
            "\"Is a cat a flying creature?\"", 
            "\"Is a dog a living creature?\"", 
            "\"Is a bird a sea creature?\"", 
            "\"Is a fish a sea creature?\""
        };
        
        String[] answers = {"no", "yes", "no", "yes"};
        String tagline = "------------------------------";
        int maxHealth = 100;
        int minHealth = 25;
        int questionIndex = 0;
      
        
        System.out.println("Tricky Question!");
        System.out.println("Answerable with Yes or No.");
        System.out.print("Press Enter to Start. ");
        String enter = scan.nextLine(); // Wait for user to press Enter
        System.out.println("------------------------------\n	  Entered");
        
      if (enter.equals("")) {
	    	  while (questionIndex < questions.length) {
	    		System.out.println(tagline);
	            System.out.println(questions[questionIndex]);
	            String userAnswer = scan.nextLine().toLowerCase();
	            System.out.println(tagline);
	
	            if (userAnswer.equals(answers[questionIndex])) {
	            } else {
	                System.out.println("That is Wrong");
	                maxHealth -= minHealth;
	            }
	            System.out.println("Current Health: " + maxHealth);
	            questionIndex++;
	            
	            if (maxHealth == 0) {
	            	System.out.println(tagline);
	            	System.out.println("Defeated");
	            	System.out.println(tagline);
	            					}
	        }
      } else {
          System.out.println(tagline);
    	  System.out.println("Invalid Input! Enter Only");
          System.out.println(tagline);
    	  System.exit(0);
      }

        scan.close();
    }
}
