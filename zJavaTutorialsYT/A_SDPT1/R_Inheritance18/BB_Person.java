package R_Inheritance18;

public class BB_Person {

	String name;
	String sex;
	int age;
	
	BB_Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	BB_Person() {
	}
	
	void checkStatus() {
		System.out.println("Name : " + name);
		System.out.println("Sex : " + sex);
		System.out.println("Age : " + age);
	}
	
	// overided
	void hungry() {
		System.out.println(" is hungry");
	}
}
