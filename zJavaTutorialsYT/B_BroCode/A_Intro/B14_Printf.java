package A_Intro;

public class B14_Printf {

	public static void main(String[] args) {
		
		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		
		// %d is a format specificer
		System.out.printf("String %d String", 1234); 
		
		// conversion character
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 18;
		double myDouble = 1000;
		
		System.out.println();
		System.out.printf("%b", myBoolean);
		System.out.println();
		System.out.printf("%c", myChar);
		System.out.println();
		System.out.printf("%s", myString);
		System.out.println();
		System.out.printf("%d", myInt);
		System.out.println();
		System.out.printf("%f", myDouble); 
		
		// minimum number of characters to be written as output
		// width field
		System.out.println();
		System.out.printf("Hello, %50s", myString);
		
		// precision
		// sets number of digits of precision when outputting floating-point values
		System.out.println();
		System.out.printf("You have this much money, %.2f", myDouble);
		
		// flags
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify = it add spaces on the right like *-20
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value 
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.println();
		System.out.printf("You have this much money, %20.2f", myDouble);
		System.out.println();
		myDouble = -1000;
		System.out.printf("You have this much money, %+020f", myDouble);
	}

}
