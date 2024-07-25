package R_Inheritance18;

public class AB_Person {
	
	String name, sex;
	int age;

	void checkStatus() {
		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		System.out.println("Age: " + age);
	}
	
	// consturctor supercalss
	AB_Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	// Explicit constructor kasi walang laman
	AB_Person() {
		
	}

}
