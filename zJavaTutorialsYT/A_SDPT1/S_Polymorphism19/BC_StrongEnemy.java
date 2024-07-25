package S_Polymorphism19;

public class BC_StrongEnemy extends B_Enemy {
	
	void dialog() {
		System.out.println(name + " : I am strong");
	}

	BC_StrongEnemy() {
		name = "Strong Enemy";
		hp = 100;
	}
	
}
