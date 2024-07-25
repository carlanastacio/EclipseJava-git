package A_Intro;

public class A4_ForLoop {

	public static void main(String[] args) {
		
		// for loop = executes a block of code a limited amount of times
		// Condition: Checked before each iteration; if false, the loop terminates.
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 10; i >= 0; i-=2) {
			System.out.println(i);
		}
	}

}
