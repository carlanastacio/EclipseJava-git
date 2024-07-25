package N_JavaConstructors14;

public class A_ConstructorCreation {

	public static void main(String[] args) {
		
		// Constructor
		AB_ProductClass p = new AB_ProductClass();
		
		
		System.out.println();
		AC_InitalizeAttributes p1 = new AC_InitalizeAttributes("Milk", 150.0f);
		AC_InitalizeAttributes p2 = new AC_InitalizeAttributes("Softdrinks", 125.0f);
		AC_InitalizeAttributes p3 = new AC_InitalizeAttributes("Water", 15.0f);
		
		// Using constructor
		System.out.println();
		AD_UsingConstructors p4 = new AD_UsingConstructors("David", "Sdpt", 'M', 18);
		AD_UsingConstructors p5 = new AD_UsingConstructors("Carleene", "Sdpt", 'F', 18);
		
		System.out.println(p4.firstName);
		System.out.println(p5.firstName);


	}

}
