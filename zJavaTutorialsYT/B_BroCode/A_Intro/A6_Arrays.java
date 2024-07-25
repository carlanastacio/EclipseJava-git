package A_Intro;

public class A6_Arrays {

	public static void main(String[] args) {
		
		// array = used to store multiple values within a single variable
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		cars[0] = "Mustang";
		System.out.println(cars[3]);
		System.out.println();
		
		String[] cars2 = new String[3];
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		System.out.println(cars2[2]);		
		System.out.println();
		
		// Using for loop
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		
	}

}
