package A_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_RegexIntroduction {

	public static void main(String[] args) {

		Pattern pattern;
		Matcher matcher;
		boolean found;
		
		// EXAMPLE 1 ""
		pattern = Pattern.compile("Hello"); // it needs exact Hello or false
		matcher = pattern.matcher("Hello"); // the ones validated
		found = matcher.find();
		System.out.println("Example 1 : " + found);
		
		// EXAMPLE 2 \\d
		pattern = Pattern.compile("Agent \\d\\d"); // it needs exactly 2 digits or more or false
		matcher = pattern.matcher("Agent 11"); // the ones validated
		found = matcher.find();	
		System.out.println("Example 2 : " + found);
		
		// EXAMPLE 3 \\d{2}
		pattern = Pattern.compile("Agent \\d{3}"); // it needs exactly 3 digits same to \\d\\d\\d
		matcher = pattern.matcher("Agent 332"); // the ones validated
		found = matcher.find();	
		System.out.println("Example 3 : " + found);
		
		// EXAMPLE 3 {1,2}
		pattern = Pattern.compile("Agent \\d{3,4}"); // it need to comply 3 or 4 digits or else false
		matcher = pattern.matcher("Agent 3333");
		found = matcher.find();	
		System.out.println("Example 3 : " + found);
		
		// EXAMPLE 4 ^
		pattern = Pattern.compile("^Agent \\d{2,3}"); // it must start specifically with A
		matcher = pattern.matcher("Agent 444");
		found = matcher.find();	
		System.out.println("Example 4 : " + found);
		
		// EXAMPLE 5 $ 
		pattern = Pattern.compile("^Agent \\d{2,3}$"); //  $ will cut off and false any over than 3 digitss
		matcher = pattern.matcher("Agent 55");
		found = matcher.find();	
		System.out.println("Example 5 : " + found);

		// EXAMPLE 6 [0-9]
		pattern = Pattern.compile("^Agent [0-6]{2,3}$");  // Matches "Agent" followed by 2 to 3 digits in the range 0-6
		matcher = pattern.matcher("Agent 060");
		found = matcher.find();	
		System.out.println("Example 6 : " + found);
		
		// EXAMPLE 7 ()
		pattern = Pattern.compile("^Ag.n. \\d{2,3}$"); // (.) any single character
		matcher = pattern.matcher("Ag!nT 777"); 
		found = matcher.find();	
		System.out.println("Example 7 : " + found);
		
		// EXAMPLE 8 [aA]
		pattern = Pattern.compile("^[aA]gent \\d{3}$"); // [aA] represents lowercase a or Uppercase A
		matcher = pattern.matcher("agent 008"); 
		found = matcher.find();	
		System.out.println("Example 8 : " + found);
		
		// EXAMPLE 9 ( | )
		pattern = Pattern.compile("^(a|aA|Aa|aa)gent \\d{3}$"); // (a|aA|Aa|aa) everything inside here is a match now
		matcher = pattern.matcher("Aagent 906"); 
		found = matcher.find();	
		System.out.println("Example 9 : " + found);
		
		// EXAMPLE 10 \\w
		pattern = Pattern.compile("^\\w \\d{2}$"); // a one any single character numbers or letters  and 2 digits 
		matcher = pattern.matcher("a 10"); 
		found = matcher.find();	
		System.out.println("Example 10: " + found);
		
		// EXAMPLE 11 *
		pattern = Pattern.compile("^\\w* \\d{2}$"); // a 0 or more * single character numbers or letters  and 2 digits 
		matcher = pattern.matcher("asd2edasdasd 11"); 
		found = matcher.find();	
		System.out.println("Example 11: " + found);
		
		// EXAMPLE 12 +
		pattern = Pattern.compile("^\\w+ \\d{2}$"); // a 1 or more * single character numbers or letters  and 2 digits 
		matcher = pattern.matcher("asd2edasdasd 20"); 
		found = matcher.find();	
		System.out.println("Example 12: " + found);
		
		// EXAMPLE 13 ?
		pattern = Pattern.compile("^\\w? \\d{2}$"); // a 1 or 0 only single characters numbers or letters  and 2 digits 
		matcher = pattern.matcher(" 03"); 
		found = matcher.find();	
		System.out.println("Example 13: " + found);
				
		
	}

}
