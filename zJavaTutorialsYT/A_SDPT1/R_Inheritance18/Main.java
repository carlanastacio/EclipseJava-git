package R_Inheritance18;

public class Main {

	public static void main(String[] args) {

		// polymorphism
		Person p1 = new Person("Name", "Sex", 0);
		Person p2 = new Toddler("Carl Baby", "M", 1, "Peek-A-Boo");
		Person p3 = new Kid("Carl Kid", "M", 10, "PS5", 4);

		p3.personMethod();

	}

}
