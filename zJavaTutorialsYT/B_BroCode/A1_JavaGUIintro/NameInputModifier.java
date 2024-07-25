package A1_JavaGUIintro;

public class NameInputModifier {

	
	public static String fullname;
	
	public static void setFULLname(String fName, String lName) {
		fullname = fName + " " + lName;
	}
	
	public String fullname2;
	
	public void setFULLname2(String fName, String lName) {
		this.fullname2 = fName + " " + lName;
	}
	
}
