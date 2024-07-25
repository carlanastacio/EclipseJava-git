package K_JavaMethods11;

public class C_GlobalVariable {
	// global variables
	// pag global dapat may static lalo kung as main method
	static String section = "A";
	static int number = 100;

	public static void main(String[] args) {
		// local
		String name = "David";
		
		saySection();
		sayNumber();
		
	}
	
	static void saySection() {
		System.out.println(section);
	}
	
	static void sayNumber() {
		System.out.println(number);
	}

}
