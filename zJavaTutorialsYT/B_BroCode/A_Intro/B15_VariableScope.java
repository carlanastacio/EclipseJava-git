package A_Intro;

import java.util.Random;

class B15_VariableScope {

	public static void main(String[] args) {

		// local = declared inside a method
		// visible only to that method

		// global = declared outside a method, but within a class
		// visible to all parts of a class

		DiceRoller diceRoller = new DiceRoller();
		
		
	}
	
}

class DiceRoller {
	
	/*	
	Random random;
	int num = 0;
	
	DiceRoller() {
		Random random = new Random();
		roll(random, num);
	}
	
	void roll(Random random, int num) {
		num = random.nextInt(6)+1;
		System.out.println(num);
	}
	*/
	
	DiceRoller() {
		Random random = new Random();
		int num = 0;
		roll(random, num);
	}
	
	void roll(Random random, int num) {
		num = random.nextInt(6)+1;
		System.out.println(num); 
	} 
}