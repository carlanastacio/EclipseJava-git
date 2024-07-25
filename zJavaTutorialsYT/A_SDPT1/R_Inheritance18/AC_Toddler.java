package R_Inheritance18;

public class AC_Toddler extends AB_Person{
	
	// automatically inherits name, sex age, by extend keyword

	String favoriteGame;
	
	// constructor inherits from superclass
	AC_Toddler(String name, String sex, int age, String favoriteGame) {
		super(name, sex, age); // required lang naman ito para maka add ng attributes like favegame
		this.favoriteGame = favoriteGame; // PARA PWEDE GUMAWA NG SARILING ATTRIBUTES NG WALA SI PERSON
	}
	
	// may drink method nawala kay person
	void drink() {
		System.out.println("Drinking Milk");
	}

}
