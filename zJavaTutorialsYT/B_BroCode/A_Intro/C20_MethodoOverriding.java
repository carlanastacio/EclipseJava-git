package A_Intro;

public class C20_MethodoOverriding {

	public static void main(String[] args) {
		// method overriding = 	Declaring a method in sub class,
		//						which is already present in parent class.
		//						done so that a child class can give its own implementation

		Dog dog = new Dog();
		
		dog.speak();
	}

}

class Animal {
	
	String animal = "Animal";
	
	void speak() {
		System.out.printf("%s" + " speak", animal);
	}
	
}

class Dog extends Animal {
	
	String animal = "Dog";
	
	@Override
	void speak() {
		System.out.printf("%s" + " speak", animal);
	}
	
}