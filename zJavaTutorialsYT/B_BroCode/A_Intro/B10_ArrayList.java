package A_Intro;

import java.util.ArrayList;

public class B10_ArrayList {

	public static void main(String[] args) {
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Burger");
		food.add("Hotdog");
		
		// set pizza to peperoni
		food.set(0, "Peperoni");
		
		// remove hotdog
		food.remove(2);
		
		// no elements
		food.clear();
		
		// for loop to initialize all arraylist
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		

	}

}
