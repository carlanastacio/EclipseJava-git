package J_Java2DArraysNestedFor10;

public class A_Java2DArraysImplementation {

	public static void main(String[] args) {
				//[row] [col]
			String[][] users = {
				// Columns 
/*rows  	  */{"David", "david123"},
				{"Alenere", "alenere123"},
				{"Hazel", "hazel123"},
				{"Jaymar", "jaymar123"}
			};
			
			int numbers[][] = new int[4][3];
			
			// change
			users[2][0] = "HazelChange";
			numbers[0][0] = 4;
			
			System.out.println(users[3][0]);
	}
}