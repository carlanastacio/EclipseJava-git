package B_Intermediate;

import java.io.File;

public class A1_FileClass {

	public static void main(String[] args) {
		
		// file - an abstraction representation of file and directory pathnames
		
		File text = new File("A1_FileText.txt");

		if(text.exists()) {
			System.out.println("The file exists!");
			System.out.println(text.getPath());
			System.out.println(text.getAbsolutePath());
			System.out.println(text.isFile());
//			text.delete(); // delete text when run 
		} else {
			System.out.println("It doesnt exist");
		}
		
	}

}
