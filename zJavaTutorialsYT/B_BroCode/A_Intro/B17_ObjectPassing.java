package A_Intro;

class B17_ObjectPassing {

	public static void main(String[] args) {

		Garage garage = new Garage();
		
		Cars car1 = new Cars("BMW", 2000);
		Cars car2 = new Cars("Tesla", 2001);
		
		garage.park(car1);
		garage.park(car2);
		
		garage.carYear(car2);
	}

}

class Garage {
	
	void park(Cars c) {
		System.out.println("The car " + c.name + " is parked in the Garage");
	}
	
	void carYear(Cars c) {
		System.out.println("The car year created is " + c.year );
		
	}
	
}

class Cars {
	
	String name;
	int year; 
	
	Cars(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
}