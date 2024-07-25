package U_AbstractionInterface21;

public class A_Main {

	public static void main(String[] args) {
		
		// ABSTRACT IDEA
//		AE_Animal A = new AE_Animal();
		
//		AE_Animal d = new AD_Dog(); // - not reccomend taht frog to frog
		
		AD_Dog d = new AD_Dog();
		AC_Frog f = new AC_Frog();
		AB_Bird b = new AB_Bird();
		
		d.makeSound();
		f.swim();
		b.fly();
	
	}

}
