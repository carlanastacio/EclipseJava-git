package R_Inheritance18;

public class Toddler extends Person{
	
	String favoriteGame;

	Toddler(String name, String sex, int age, String favoriteGame) {
		super(name, sex, age);
		
		this.favoriteGame = favoriteGame;
	}
	
	
	void drink() {
		System.out.println("Drinks milk");
//		super.checkStatus();
	}
	
	void checkStatus() {
		super.checkStatus();
	}
	
	void toddlerMethod() {
		System.out.println("Special to Toddler");
	}

}
