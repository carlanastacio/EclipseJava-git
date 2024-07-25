package A_JavaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_TryWithResources {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = "";
			str = br.readLine();
			System.out.println("You entered: " + str);
		}

	}

}
