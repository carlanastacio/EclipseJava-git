package I_JavaForEachLoop9;

public class A_IterateForEachLoop {

	public static void main(String[] args) {
		
		String[] names = {"David", "Alenere", "Jasfer", "Ace", "Jaymar"};
		
			for(String x : names) {
				System.out.println(x);
			}
			
		int[] nums = {1,2,3,4,5};
			
			for(int n: nums) {
				System.out.println(n);
				break;
			}
	}

}
