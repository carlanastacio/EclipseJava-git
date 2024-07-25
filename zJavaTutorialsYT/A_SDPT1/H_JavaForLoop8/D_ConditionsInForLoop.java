package H_JavaForLoop8;

import java.util.Scanner;

public class D_ConditionsInForLoop {

	public static void main(String[] args) {
		
		String[] names = {"David","Alener","Ace","Jaymar","Jasfer","Emman"};
		
		Scanner scan = new Scanner(System.in);
		
		/*	int x = 0;
		while(x < names.length) {
			if(names[x].equals("Jaymar")) {
				System.out.println("We found " + names[x]);
			}
			x++;
		} */
		
		System.out.print("Names to search : ");
		String search = scan.nextLine();


		
		for(int i = 0; i < names.length; i++) {
				if(names[i].equalsIgnoreCase(search)) {
					System.out.println("We found " + names[i]);
					break; // to avoid dead spot or sunod na array di ma println
				} else {
					System.out.println(names[i]);
				}
		}
	
		
	}
}
