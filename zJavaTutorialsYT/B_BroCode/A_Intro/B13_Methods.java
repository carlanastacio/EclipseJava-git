package A_Intro;

public class B13_Methods {

	public static void main(String[] args) {

		// method = a block of code that is executed whenever it is called upon
		String name = "Bro";
		int age = 21;
		hello(name, age);
		
		int x = 3;
		int y = 5;
		
		int sum = sum(x, y);
		System.out.println(sum);
		
	}
	
	// common naming convention is to have method name lowercase like main
	// you can change paramater aslong as matching set of paratmeters
	static void hello(String title, int age) {
		System.out.println("Hello, " + title);
		System.out.println("You are " + age);
	}
	
	static int sum(int x, int y) {
		return x + y;
	}
	
	
}
