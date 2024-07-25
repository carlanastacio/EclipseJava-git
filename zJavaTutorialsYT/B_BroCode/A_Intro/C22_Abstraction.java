package A_Intro;

public class C22_Abstraction {

	public static void main(String[] args) {
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
				
		
		//	Vehicle vehicle = new Vehicle(); this cannot instantiate type vehicle, this adds a layer or securitys
		
		Carr car = new Carr();
		car.go();
		Ecar Ecar = new Ecar(); 
		Ecar.go();
	}

}

abstract class Vehicle {

	abstract void go();
}

class Carr extends Vehicle {

	@Override
	void go() {
		System.out.println("The driver is driving the car");
		int i = 1;
	}
	
}

class Ecar extends Carr {
	
	@Override
	void go() {
	}
	
}
