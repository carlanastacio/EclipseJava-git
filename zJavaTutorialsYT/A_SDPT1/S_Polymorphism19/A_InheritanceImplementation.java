package S_Polymorphism19;

public class A_InheritanceImplementation {

	public static void main(String[] args) {

		AB_Dog d = new AB_Dog();
		AC_Cat c = new AC_Cat();
		
		d.makeSound();
		c.makeSound();
		
		// polymoprhism isang class multiple forms
		A_Animal ab = new AB_Dog();
		A_Animal ac = new AC_Cat();

		// super to sub
		ab.makeSound();
		// animal supert to cat
		ac.makeSound();
		
		
	}

}
