package W_Enum23;

public class A_EnumsImplementation {

	public static void main(String[] args) {

		AB_AILevel level = AB_AILevel.HARD;
		
		if(level == AB_AILevel.EASY) System.out.println("For babies");
		else if(level == AB_AILevel.MEDIUM) System.out.println("For Kids");
		else if(level == AB_AILevel.HARD) System.out.println("For Men");
		
		AB_AILevel level2 = AB_AILevel.MEDIUM;
		
		switch(level2) {
		case EASY:  System.out.println("For babies"); break;
		case MEDIUM: System.out.println("For Kids"); break;
		case HARD: System.out.println("For Men"); break;
		}
			
		
	}

}
