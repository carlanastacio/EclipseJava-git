package K_JavaMethods11;

public class F_OverloadingMethods {

	public static void main(String[] args) {
		
		System.out.println(add(1.5,2.5));

		System.out.println(add(1,2));
		System.out.println(add(1,2,3));

		

	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	static double add(double num1, double num2) {
		return num1 + num2 ;
	}
	
}
