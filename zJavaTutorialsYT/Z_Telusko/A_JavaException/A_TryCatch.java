package A_JavaException;

public class A_TryCatch {

	public static void main(String[] args) {
		
		int a, b, c = 0;
		
		a = 5;
		b = 0;

		try {
			c = a / b;
		} catch(Exception e) {
			System.out.println("You cannot divide to Zero\n" + e);
		}

	}

}
