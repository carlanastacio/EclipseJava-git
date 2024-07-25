package K_JavaMethods11;

public class E_ReturnKeyword {

	public static void main(String[] args) {

		int sum = multiply(5,2);
		
		System.out.println(sum);
		
		System.out.println(isLegal(19));
		
	}

	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	static boolean isLegal(int age) {
		if(age < 18) return true;
		else return false;
	}
	
}
