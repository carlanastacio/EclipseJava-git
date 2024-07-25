package A_Intro;

public class B18_StaticKeyword {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();
		
		Math.round(0);
	}

}

class Friend {
	
	String name;
	
	static int numberOfFriends;
	
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("Friend list is " + numberOfFriends);
	}
}