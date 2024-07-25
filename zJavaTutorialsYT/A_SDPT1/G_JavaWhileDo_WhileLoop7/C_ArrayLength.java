package G_JavaWhileDo_WhileLoop7;

public class C_ArrayLength {

	public static void main(String[] args) {
		
		String[] names = {"Carl", "Zeus", "Mike", "Jozef", "Red"};
		
		int i = 0;
		
		while(i < names.length) {
			System.out.print(i + 1 + names[i] + " " );
			i++;
		}
	}

}
