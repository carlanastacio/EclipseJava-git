package Z_Package;

import A_Intro.*;

public class C23_AccessModifier3 {
	
	String defaultString = "This is a default and cannot be accessed on other packages";

	public String publicString = "This is public and can be accessed on any other package within the PROJECT FOLDER";
	
	protected String protectedString = "This is  protected and is accessible ot different class and packages aslong as that class is a subclass contains that protected value";
	
	private String privateString = "This is private and it is only visible to this class itself";

}
