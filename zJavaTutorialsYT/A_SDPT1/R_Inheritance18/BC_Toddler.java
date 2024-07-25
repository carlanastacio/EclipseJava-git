package R_Inheritance18;

public class BC_Toddler extends BB_Person{
	
	String favoriteGame;
	
	BC_Toddler(String name, String sex, int age, String favoriteGame) {
		
		super(name, sex, age);
		this.favoriteGame = favoriteGame;
		
	}
	
	BC_Toddler(){
		super(); // overide
	}
	
	void drink() {
		System.out.println(name + " is drinking milk");
	}
	
	// inoveride un sa bb_person gamit super 
	void checkStatus() {
		// mag super para ma retain un check status sa bb_person
		super.checkStatus();
		System.out.println("Favorite Game : " + favoriteGame);
	}
	
	void hungry() {
		System.out.print(name); 
		super.hungry(); // overide dun sa bb_person method na hungy();
	}

}
