package R_Inheritance18;

public class Kid extends Toddler {
	
	int gradeLevel;

	Kid(String name, String sex, int age, String favoriteGame, int gradeLevel) {
		super(name, sex, age, favoriteGame);
		this.gradeLevel = gradeLevel;
	}
	
	void checkStatus() {
		super.checkStatus();
		System.out.println(gradeLevel);
	}

	void kidMethod() {
		System.out.println("Special to Kid");
	}
}
