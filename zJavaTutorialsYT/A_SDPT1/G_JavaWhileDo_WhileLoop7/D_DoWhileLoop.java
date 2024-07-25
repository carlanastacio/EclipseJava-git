package G_JavaWhileDo_WhileLoop7;

public class D_DoWhileLoop {

	public static void main(String[] args) {
		
		int i = 0, c = 3;

		// while loop (nauna condition bago execute)
		System.out.println("While");
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		// do while (code na nageexecute one time) // (nag execute bago nag check ng condition)
		System.out.println("\nDo While");
		do { 
			
			System.out.println(c);
			c++;
			
		} while (c <= 5);
	

	}

}
