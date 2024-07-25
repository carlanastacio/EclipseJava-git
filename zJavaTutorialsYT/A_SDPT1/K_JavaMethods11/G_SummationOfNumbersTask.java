package K_JavaMethods11;

import java.util.Scanner;

public class G_SummationOfNumbersTask {	
		
	public static void main(String[] args) {

		 int numArray[] = {5,10,15,20};
		 int sum2 = summation(numArray);
		 
		 print(sum2);
		 
	}
	
		static int summation(int numArray[]) {
			int sum = 0;
				for(int i: numArray) {
					sum += i;
				}
			return sum;
		}
		
		static void print(int sum2) {
			System.out.println(sum2);
		}
}

