package P_JavaEncapsulation16;

public class AB_User {

	private int userID;
	private String userName;
	private String firstName, lastName;
	
	// dito sa loob ng class nababago kaya mas protected
	AB_User(int userID, String userName, String firstName, String lastName) {
		this.userID = userID;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// dito para sa isang variable lang meaning kahit private maiseset pag hunmingi ng user id sa kabilang class
	void setUserID(int userID) {
		this.userID = userID;
	}
	
	// di kailangan ng paramater kasi irereturn lang
	int getUserID() {
		return this.userID;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
}
