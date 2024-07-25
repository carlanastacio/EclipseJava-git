package A_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D_TurningGroupsIntoVars {

	public static void main(String[] args) {
		
		// groups 								1				2
		Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
		Matcher matcher = pattern.matcher("10 divided by 2");

		// 10 divided by 2
		// 10 / 2
		if(matcher.find()) {
			String simplified = "result : " + matcher.replaceFirst("$1/$2"); // re write the groups into this string
			System.out.println(simplified);
			int result = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
			System.out.println(result);
		}
	}

}
