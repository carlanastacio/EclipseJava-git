package S_Polymorphism19;

public class B_InheritanceEnemy {

	public static void main(String[] args) {

		B_Enemy we = new BB_WeakEnemy();
		B_Enemy se = new BC_StrongEnemy();
		
		// void dialog
		we.dialog();
		se.dialog();

		// status print shits
		we.showStatus();
		se.showStatus();
		
	}

}
