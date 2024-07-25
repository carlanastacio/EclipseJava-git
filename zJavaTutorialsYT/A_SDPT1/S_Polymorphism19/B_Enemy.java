package S_Polymorphism19;

public class B_Enemy {
	
	String name;
	int hp;

	void dialog() {
		System.out.println("Please override me");
	}
	
	void showStatus() {
		System.out.println("Name : " + name);
		System.out.println("HP : " + hp);
	}
}
