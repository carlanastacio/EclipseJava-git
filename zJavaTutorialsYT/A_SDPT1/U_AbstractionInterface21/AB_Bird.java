package U_AbstractionInterface21;

public class AB_Bird implements AE_Animal, AF_AirAnimal_WithExtends {
	
	public void makeSound() {
		System.out.println("Chirp");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void fly() {
		System.out.println("Flying");
	}
	


}
