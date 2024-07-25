package R_Inheritance18;

public class Person {
	
	String name;
	String sex;
	int age;
	
	Person(String name, String sex, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	void checkStatus() {
		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		System.out.println("Age: " + age);
	}
	
	void personMethod() {
		System.out.println("Special to Person");
	}

}
