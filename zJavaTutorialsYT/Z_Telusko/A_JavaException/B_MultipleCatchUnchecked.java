package A_JavaException;

public class B_MultipleCatchUnchecked {

	public static void main(String[] args) {

		int a, b, c = 0;
		int d[] = new int[4];

		a = 5;
		b = 2;

		try {
			c = a / b;
			for(int i = 0; i <= 4; i++) {
				d[i] = i + 1;
			}
			for(int value : d) {
				System.out.println(value);
			}
		} catch (ArithmeticException ae) {
			System.out.println("You cannot divide to Zero\n" + ae);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Maximum number of value is " + d.length);
		}
		
	}

}
