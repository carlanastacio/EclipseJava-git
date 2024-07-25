package A_Intro;

public class C24_CopyObjects {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2("Chevrolet", "Camaro", 2024);
		
	
		System.out.println(car1); // they share same address
	//	System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
/*		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());	
		
		*/

		Car2 car2 = new Car2(car1);
		car2.copy(car1);
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());	
	}

}



class Car2 {
	
	private String make;
	private String model;
	private int year;
	
	Car2(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// copy constructor
	Car2(Car2 c) {
		this.copy(c);
	}
	
	void setMake(String make) {
		this.make = make;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	void setYear(int year) {
		this.year = year;
	}

	
	String getMake() {
		return make;
	}
	
	String getModel() {
		return model;
	}
	
	int getYear() {
		return year;
	}
	
	public void copy(Car2 c) {
		this.setMake(c.getMake());
		this.setModel(c.getModel());
		this.setYear(c.getYear());
	}
	
}