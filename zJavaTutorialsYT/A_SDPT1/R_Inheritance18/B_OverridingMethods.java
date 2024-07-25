package R_Inheritance18;

public class B_OverridingMethods {
	
	public static void main(String[] args) {
	
		// overiding methods 
	BC_Toddler t1 = new BC_Toddler("SDPT", "M", 1, "Peek-A-Boo");
	// no parameters 
//	BB_Person b1 = new BB_Person();
		
		t1.checkStatus();
		blank();
		t1.drink();
		blank();
		t1.hungry();
	}
	
	static void blank() {
		System.out.println();
	}
}
