package B_Intermediate;

import java.io.FileWriter;
import java.io.IOException;

public class A2_FileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("A1_FileText.txt");	
			writer.write("this is a filewriter method"
					+ "\nRoses are red"
					+ "\nViolets are blue"
					+ "\ndiba tanginamo");
			writer.append("\n(A poem by real bro)");
			writer.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
			
		
	}

}
