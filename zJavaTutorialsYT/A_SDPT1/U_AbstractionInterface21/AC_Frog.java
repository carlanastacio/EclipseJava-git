package U_AbstractionInterface21;

public class AC_Frog implements AE_Animal, AF_LandAnimal, AF_WaterAnimal {
	
	public void makeSound() {
		System.out.println("Ribit");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	

}
