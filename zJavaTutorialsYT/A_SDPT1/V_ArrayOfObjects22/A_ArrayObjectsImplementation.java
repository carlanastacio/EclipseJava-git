package V_ArrayOfObjects22;

public class A_ArrayObjectsImplementation {

	public static void main(String[] args) {

//		AB_Employee e = new AB_Employee("Alenere", "SDPT", "Programmer"); - not advisable since madami 

		// ARRAY OF OBJECTS
		AB_Employee employees[] = new AB_Employee[2];

		// STORING Objects Inside Array
		employees[0] = new AB_Employee("David", "SDPT", "Web Developer");
		employees[1] = new AB_Employee("Alenere", "SDPT", "Game Programmer");

		// System.out.println(employees[1].firstName);
		// employees[0].introduceSelf();

		// null pointer inacess un walang laman
		// for loop
		for (int i = 0; i < employees.length; i++) {
			employees[i].introduceSelf();
		}
		// for each loop
		for (AB_Employee e : employees) {
			e.introduceSelf();
		}

	}

}
