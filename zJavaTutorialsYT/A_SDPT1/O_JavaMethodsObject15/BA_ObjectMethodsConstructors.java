package O_JavaMethodsObject15;

public class BA_ObjectMethodsConstructors {
	
	String fN, lN, course, section;
	int year, midtermGr, finalGr, average;
	
	BA_ObjectMethodsConstructors(String fN, String lN, String course, String section, int year, int midtermGr, int finalGr) {
		this.fN = fN;
		this.lN = lN;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midtermGr = midtermGr;
		this.finalGr = finalGr;
		
	}
	
	void introduceSelf() {
		
		System.out.println("Full Name : " + fN + " " + lN);
	/*	System.out.println("Course : " + course);
		System.out.println("Year : " + year);
		System.out.println("Section : " + section);
	*/

		
	}
	
	int evalGrade() {
		int sum = midtermGr + finalGr;
		int average = sum / 2;
		System.out.println("Average : " + average);
		
		System.out.print("Remarks : ");
		if(average > 100) {
			System.out.println("Error Input. It exceeds 100");
		} else if(average <= 100 && average >= 98) {
			System.out.println("With Highest Honor");	
		} else if(average < 98 && average >= 95) {
			System.out.println("With High Honor");
		} else if(average < 95 && average >= 90) {
			System.out.println("With Honor");
		} else if(average < 90 && average >= 75) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		return average;		
	}

}
