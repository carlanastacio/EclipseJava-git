package M_JavaClassesObjects13;

public class A_ClassCreation {

	public static void main(String[] args) {

		B_Person pObj = new B_Person();
		
		pObj.firstName = "David";
		pObj.lastName = "Sdpt";
		pObj.sex = 'M';
		pObj.age = 18;
		
		B_Person pObj2 = new B_Person();
		pObj2.firstName = "Alenere";
		pObj2.lastName = "Sdpt";

		
		System.out.println(pObj2.firstName);
	}

}
