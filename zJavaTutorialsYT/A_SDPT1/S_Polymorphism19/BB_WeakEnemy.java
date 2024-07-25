package S_Polymorphism19;

public class BB_WeakEnemy extends B_Enemy {
	
	void dialog() {
		System.out.println(name + " : I'am weak");
	}
	
	BB_WeakEnemy() {
		name = "Weak enemy";
		hp = 10;
	}

}
