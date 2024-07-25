package R_Inheritance18;

public class C_NestedInheritance {
	
	public static void main(String[] args) {
	
	// pwede ito dahil naka inherit siya sa previous methods na BB_Person
	BB_Person k1 = new BB_Person(); 
	System.out.println(k1.age);
	BB_Person k2 = new BC_Toddler();
	
	// yan na un polymorphism kasi ung nag popolyphorm sya 
	
	CB_Kid k3 = new CB_Kid("SDPT", "M", 10, "PS4", 5);	
	k3.sayGradeLevel();
	
	
	CB_Kid k4 = new CB_Kid();
	
	String name = k4.name = "SDPT";
	System.out.println(name);
	

		
	}

}
