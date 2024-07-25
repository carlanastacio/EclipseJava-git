package L1_JavaPackageModifers12;

import L2_JavaMathematics12.*;

public class B_NonAccessModifiers {

	public static void main(String[] args) {

//		arithmetic aObj = new arithmetic();
		constants cObj = new constants();
		
		// final - non acess modifier test 
		System.out.println(cObj.pi2);
		
		// non access modifier without instatntaite
		int sum = arithmetic.add2(2, 1);
		System.out.println(sum);
		
		// non access modifier without instantiation of a class
		System.out.println(constants.staticpi);
		
	}

}
