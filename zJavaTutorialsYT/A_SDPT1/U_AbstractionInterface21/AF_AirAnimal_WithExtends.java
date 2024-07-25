package U_AbstractionInterface21;

// wala naman flying animal na di kaya mag lakad

public interface AF_AirAnimal_WithExtends extends AF_LandAnimal {

	abstract void fly();

	String name = "Animal";

	default void sayHello() {
		System.out.println("Hello");
	}

}
