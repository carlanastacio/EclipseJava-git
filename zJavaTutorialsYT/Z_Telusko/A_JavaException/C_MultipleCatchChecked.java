package A_JavaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_MultipleCatchChecked {

	public static void main(String[] args) {

		int a, b = 1, c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = 8;
	

		try {
			b = Integer.parseInt(br.readLine());
			c = a / b;
			
			System.out.println("Output is " + c);
			
		} 
		catch(IOException ioe) {
			System.out.println("Some IO Error");
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot Divide by Zero " + ae);
		}
		catch(Exception e) {
			System.out.println("Uknown Exception");
		}

	}

}
