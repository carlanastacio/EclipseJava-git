package I_JavaForEachLoop9;

import java.util.Scanner;

public class B_ConditionsinForEachLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] names = {"David", "Alenere", "Jasfer", "Ace", "Jaymar"};
		
		String inpUser = scan.nextLine();

			for(String name: names) {
				if(name.equalsIgnoreCase(inpUser)) {
					System.out.println("We Found " + name);
					break; // walang pinagkaiba kapag if statement lang ang gamit pere if may else na ibana
				}else {
					System.out.println(name);
				}
			}
		
	}

}
