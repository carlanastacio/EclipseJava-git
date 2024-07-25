package A_Intro;

public class A8_ToStringMethod {

	public static void main(String[] args) {

		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods

		String name = "Carl";
		boolean result1 = name.equalsIgnoreCase("CaRl");
		System.out.println(result1);
		
		int result2 = name.length();
		System.out.println(result2);
		
		char result3 = name.charAt(3);
		System.out.println(result3);
		
		int result4 = name.indexOf("r");
		System.out.println(result4);

		name = "";
		boolean result5 = name.isEmpty();
		System.out.println(result5);
		
		name = "Carl";
		String result6 = name.toUpperCase(); // .toLowerCase();
		System.out.println(result6);
		
		name = " Carl    			 ";
		String result7 = name.trim();
		System.out.println(result7);
		
		name = "Carl";
		String result8 = name.replace("a", "u");
		System.out.println(result8);
	}
}
