package L1_JavaPackageModifers12;


import L2_JavaMathematics12.*;

public class A_AccessModifiers {

	public static void main(String[] args) {

		// class instantiation
		arithmetic aObj = new arithmetic();
		constants cObj = new constants();
		
		// access modifiers with class 
		int sum = aObj.add(1,2);
		System.out.println(sum);
		
		// access modifiers with methods and variables
		System.out.println(cObj.pi);
		
	}

}
