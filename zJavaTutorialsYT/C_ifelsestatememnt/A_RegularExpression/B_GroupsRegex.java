package A_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_GroupsRegex {

	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;
		
		// groups							1		2
		pattern = Pattern.compile("^[aA](group)(\\d{2})");
		matcher = pattern.matcher("agroup10");
		
		if(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		}
		
		
	}

}
