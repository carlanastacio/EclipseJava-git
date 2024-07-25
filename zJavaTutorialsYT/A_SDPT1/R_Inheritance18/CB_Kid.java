package R_Inheritance18;

// naka nest sa previous subclass din
public class CB_Kid extends BC_Toddler {
	
	int gradeLevel;

	CB_Kid(String name, String sex, int age, String favoriteGame, int gradeLevel) {
		super(name, sex, age, favoriteGame); // na inherit nya ito sa previous
		
		this.gradeLevel = gradeLevel;
	}
	
	CB_Kid() {
		super();
	}
	
	// No-argument constructor with default values pwede din ito para kahit walng super() sa previous ganito nlng assigning values
/*	CB_Kid() {
		super("DefaultName", "DefaultSex", 0, "DefaultGame");
		this.gradeLevel = 0; // or any default value you prefer
	} */
	
	void sayGradeLevel() {
		System.out.println(name + " is grade " + gradeLevel);
	}
}
