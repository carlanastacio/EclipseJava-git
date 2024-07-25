package T_AbstractionClasses20;

public abstract class AB_Animal {
	
	String name;

	abstract void makeSound();
	
	void setName(String name) {
		this.name = name;
	}
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	
}
