package J_Java2DArraysNestedFor10;

public class C_Iterating2DArrays {

	public static void main(String[] args) {
		
		String users[][] = {
				{"David","David123"},
				{"Alenere","Alenere123"},
				{"Hazel","Hazel123"},
				{"Jaymar","Jaymar123","Jupiter"},
		};
		
		
		for(int row = 0; row < users.length; row++) {
			for(int col = 0; col < users[row].length; col++) {
				System.out.println(users[row][col]);
			}
			System.out.println();
		}
		
		
		
	}

}
