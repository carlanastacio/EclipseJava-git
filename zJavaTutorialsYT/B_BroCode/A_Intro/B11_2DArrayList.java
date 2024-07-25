package A_Intro;

import java.util.*;

public class B11_2DArrayList {

	public static void main(String[] args) {

		// 2D ArrayList = A dynamic List of List
		// You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		// list 0
		ArrayList<String> bakeryList = new ArrayList();
		// item - 0,1,2
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		// list 1
		ArrayList<String> produceList = new ArrayList();
		// item - 0,1,2
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
		// list 2
		ArrayList<String> drinksList = new ArrayList();
		// item - 0,1,
		drinksList.add("Soda");
		drinksList.add("Coffee");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		// list 0 - item 2
		System.out.println(groceryList.get(0).get(2));
		
	}

}
