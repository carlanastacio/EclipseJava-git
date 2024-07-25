package O_JavaMethodsObject15;

public class A_ObjectMethods {

	public static void main(String[] args) {

		AB_Character c = new AB_Character("David", "Hello there", 100, 50, 5);	
		AB_Character c1 = new AB_Character("Alenere", "Hello there", 75, 25, 10);	
		// Method inside another instantiated class or object
		c.introduce();
		c1.introduce();
		
		c.sayDialog();
		
		System.out.println();
		c.talkTo1("Jaymar");
		c1.talkTo1("Emman"); 
		
		System.out.println();
		c.talkTo2(c1);
		
		
		System.out.println();
		System.out.println(c1.talkTo3(c1));

	}

}
