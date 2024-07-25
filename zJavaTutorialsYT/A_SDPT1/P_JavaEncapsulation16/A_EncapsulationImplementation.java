package P_JavaEncapsulation16;

public class A_EncapsulationImplementation {

	public static void main(String[] args) {

		// walang constructor kaya no need mag instantiate ng parameters
	//	AB_User u = new AB_User();
		
		AB_User u = new AB_User(12313, "Hotdog123", "Alenere", "Sdpt");
		
		u.setUserID(10020);
		int id = u.getUserID();
		System.out.println(id);
		
		// Declatre a variable first before printing
		u.setFirstName("Carl");
		// GETTERS ONLY CAN BE PRINTED NOT SET METHOD CAUSE IT IS USED TO SET VARIABLES ONLY METHOD
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		
	}

}
