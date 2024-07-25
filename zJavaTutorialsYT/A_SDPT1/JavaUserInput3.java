import java.util.Scanner;

// User input & Arithmetic Operators 
public class JavaUserInput3 {

  public static void main(String[] args) {
	
	  double result;
	  
	  Scanner s = new Scanner(System.in);
	  
	  System.out.print("Input the first Number: ");
	  double inp1Num = s.nextDouble();
	  
	  System.out.print("Input the second Number: ");
	  double inp2Num = s.nextDouble();
	  
	  result = inp1Num + inp2Num;
	  System.out.print("Number one + Number two is equals to " + result); 

	  s.close();
  }
} 
