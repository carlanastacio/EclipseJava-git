package O_JavaMethodsObject15;

public class AB_Character {
	
	String name, dialog;
	int hp, mp, lvl;
	
	// Constructor di kaialngan ng modifier at return type 
	AB_Character(String name, String dialog, int hp, int mp, int lvl){
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}

	void introduce() {
		System.out.println("I am " + name);	
	}
	
	void sayDialog() {
		System.out.println(name + " : " + dialog);
	}
	
	void talkTo1(String firstName) {
		System.out.println(name + " said Hello " + firstName);
	}
	
	void talkTo2(AB_Character x) {
		System.out.println(name + " : Hello, " + x.name);
	}
	
	// dahil string nirererturn nito pwede sya ibalik sa main class at iprint
	// ginawang parameter ang AB_Character sa x para naka instantiate ang lahat ng attributes
	String talkTo3(AB_Character x) {
		return name + " : Hello, " + x.name;
	} 
}
