package T_AbstractionClasses20;

public class A_Main {

	public static void main(String[] args) {

	/*	wala naman animal =new animal - this is useless its an abstract idea walang animal na animal
		mayroon animal na dog 
		
		// ABSTRACT IDEA
		AB_Animal a = new AB_Animal(); - thtis cannot be intantiated 
		
		*/
		
		// CONCRETE IDEA
		AB_Animal d = new AC_Dog(); // - ito ang kailangan
		AB_Animal c = new AD_Cat();  
		
		d.setName("Doggie");
		d.showName();
		c.makeSound();
		
	}

}
