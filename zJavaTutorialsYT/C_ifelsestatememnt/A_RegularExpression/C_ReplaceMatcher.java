package A_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_ReplaceMatcher {

	public static void main(String[] args) {
		
		String cardNum = "1111-2222-3333-4444";
		
		Pattern pattern1 = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher1 = pattern1.matcher(cardNum);
		// make "XXXX-XXXX-XXXX-4444"
		
		String maskedCardNum = matcher1.replaceAll("XXXX-XXXX-XXXX-");
		System.out.println(maskedCardNum);
		

	}

}
