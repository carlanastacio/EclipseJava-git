package A_Intro;

public class C21_SuperKeyword {

	public static void main(String[] args) {

		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman", 42, "Money");
		Hero hero2 = new Hero("Superman", 43, "Everything");
	
		System.out.println(hero1.name);
		System.out.println();
		
		System.out.println(hero2.toString());
		
	}

}

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}

class Hero extends Person {
	
	String power;
	
	Hero(String name, int age, String power) {
		super(name, age);
		this.power = power;
	}
	
	
	public String toString() {
		return super.toString() + this.power;
	}
	
}