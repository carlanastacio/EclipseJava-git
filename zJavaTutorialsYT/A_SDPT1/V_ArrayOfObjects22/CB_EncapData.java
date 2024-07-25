package V_ArrayOfObjects22;

public class CB_EncapData {
    private String fName;
    private String lName;
    private int year;
    private String course;
    private char section;

    // Constructor to initialize the data
    public CB_EncapData(String fName, String lName, int year, String course, char section) {
        this.fName = fName;
        this.lName = lName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    // Method to display student details
    public void getAllDetails() {
        System.out.println("Full Name : " + fName + " " + lName);
        System.out.println("Course/Sec./Yr. : " + course + " - " + section + " of " + year);

    }
}