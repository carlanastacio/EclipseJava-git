package V_ArrayOfObjects22;

public class AB_Employee {
	
	String firstName, lastName;
	String jobTitle;
	
	AB_Employee(String firstName, String lastName, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
	}
	
	void introduceSelf() {
		System.out.println("Full name : " + firstName + " " + lastName);
		System.out.println("Job Title : " + jobTitle);
		System.out.println();
		
	}

}
