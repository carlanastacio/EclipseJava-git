package Q_OverloadingConstructors17;

public class AB_Employee {

	private String firstname, lastname;
	private String title, address, sex;
	
	private int age;
	
	AB_Employee() {
		firstname = "N/A";
		lastname = "N/A";
		title = "N/A";
		address = "N/A";
		sex = "N/A";
		age = 0;
	}
	
	AB_Employee(String firstname, String lastname, String title) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.title = title;
		address = "N/A";
		sex = "N/A";
		age = 0;
	}
	
	AB_Employee(String firstname, String lastname, String title, String address, String sex, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.title = title;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}
	
	
	
}
