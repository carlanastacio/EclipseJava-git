package A_Intro;

import java.util.ArrayList;

public class B12_ForEachLoop {

	public static void main(String[] args) {

		// also known as enhanced for loop	
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible

		
		String[] animals = {"Bird", "Cat", "Dog"};
		
		// for every string i in array of animals
		for(String i: animals) {
			System.out.println(i);
		}
		
		ArrayList<String> animals2 = new ArrayList();
		animals2.add("Dog");
		animals2.add("Cat");
		animals2.add("Bird");
		
		for(String j: animals2) {
			System.out.println(j);
		}
		
	}

}
