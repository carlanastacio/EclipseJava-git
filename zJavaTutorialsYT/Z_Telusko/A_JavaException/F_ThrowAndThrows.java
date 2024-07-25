package A_JavaException;

public class F_ThrowAndThrows {

	public static void main(String[] args) /* throws Exception */ {
		
		int k = 5 / 0;
		
		if (k == 0) {
			throw new ArithmeticException("Wrong!");
		}
		

	}

}
