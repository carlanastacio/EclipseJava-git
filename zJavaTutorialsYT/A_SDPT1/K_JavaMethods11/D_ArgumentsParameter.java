package K_JavaMethods11;

public class D_ArgumentsParameter {

	public static void main(String[] args) {
		
		// print method
		String x = "Dave.";
		print("Hello, " + x);
		
		// add method
		add(5,5);
		
		// greet method
		greet("Jay", 18);
	}
	
	static void greet(String name, int age) {
		// pwede din dito sa loob ng greet logic lang 
		print("Hello, " + name + " and you are " + age);
	}
	
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	static void print(String word) {
		System.out.println(word);
	}

}
