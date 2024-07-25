package B_DatatypeConversion;

public class D_ExplicitConversion {

	public static void main(String[] args) {

		double pi = 3.14;
		float f = (float)pi; // pero pag tinangal natin un (float) mag rereklamo yan
		
		System.out.println("double : " + f + "\nfloat : " + pi);
		
		int x = (int)f; // hindi supported ang decimal
		System.out.println("int : " + x);
		
		int num = 1000;
		byte b = (byte)num;
		System.out.println("integer : " + num + "\nbyte : " + b); // un byte naging -24 b
	}

}
