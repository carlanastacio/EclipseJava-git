package I_JavaForEachLoop9;

public class C_ArrayofIntergersSummation {

	public static void main(String[] args) {

		int[] numbers = {5,5,5,5,5};
		int sum = 0;
		
			for(int i:numbers) {
				sum += i;
			}
			System.out.println(sum);
	}

}
