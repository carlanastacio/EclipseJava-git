package R_Inheritance18;

public class A_InheritanceImplementation {

	public static void main(String[] args) {
		
		AB_Person p1 = new AB_Person("David", "M", 18);
		// Explicit Constructor
		AB_Person p2 = new AB_Person();
		p2.name = "David";
		p2.age = 18;
		p2.sex = "M";
		
		AC_Toddler t1 = new AC_Toddler("Alenere", "F", 1, "Peek-A-Boo");
/*		t1.name = "Alenere";
		t1.age = 1;
		t1.sex = "F"; 	*/
		
		p1.checkStatus();
		p2.checkStatus();
		
		t1.checkStatus();
		t1.drink();
		
	}

}
