package B_RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class A_RegEx {

	public static void main(String[] args) {

		// string to be scanned to find the pattern
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d)(.*)";
		
		// create a pattern object
		Pattern r = Pattern.compile(pattern);
		
		// matcher object
		Matcher m = r.matcher(line);
		
		
		if(m.find()) {
			System.out.println("Found Value: " + m.group(0));
			System.out.println("Found Value: " + m.group(1));			
			System.out.println("Found Value: " + m.group(2));
		} else {
			System.out.println("No Match");
		}
		
		
	}

}
