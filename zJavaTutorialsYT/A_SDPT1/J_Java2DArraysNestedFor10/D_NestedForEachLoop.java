package J_Java2DArraysNestedFor10;

public class D_NestedForEachLoop {

	public static void main(String[] args) {

		String users[][] = {
				{"David","David123"},
				{"Alenere","Alenere123"},
				{"Hazel","Hazel123"},
				{"Jaymar","Jaymar123","Jupiter","18"},
		};
			
			for(String user[]: users) {
				for(String info: user) {
					System.out.println(info);
				}
				System.out.println();
			}
		
	}

}
