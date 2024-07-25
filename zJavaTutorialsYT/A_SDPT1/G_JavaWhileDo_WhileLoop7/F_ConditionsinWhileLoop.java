package G_JavaWhileDo_WhileLoop7;

public class F_ConditionsinWhileLoop {

	public static void main(String[] args) {

		// Condition while loop with nested if
		System.out.println("Condition while loop with nested if statement");

		String[] names = {"Carl", "Zeus", "Mike", "Jozef", "Con", "Red"};
		int i = 0;
		
		while (i < names.length) {
			if (names[i].equalsIgnoreCase("con")) {
					System.out.println("We found: ".concat(names[i]));
				break;
			}
			i++;
		}
		

		// Condition while loop with nested if else
		System.out.println();
		System.out.println("Condition while loop with nested if else statement");

		String[] names2 = {"David", "Alener", "Patrick", "Ace", "Jasfer"};
		int i2 = 0;
				
		while (i2 < names2.length) {
			
			if (names2[i2].equalsIgnoreCase("patrick")) {
					System.out.println("We found: " + names2[i2]);
					break;					
			} else {
				System.out.println(names2[i2]);
			}
			i2++;
		}
				
	}
}
