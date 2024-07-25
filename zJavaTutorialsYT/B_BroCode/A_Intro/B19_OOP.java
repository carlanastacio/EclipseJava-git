package A_Intro;

public class B19_OOP {

	public static void main(String[] args) {

		Wallet myWallet = new Wallet();
		
		myWallet.add(10);
		
		myWallet.get(5);
		
		myWallet.look();
		
	}

}

class Wallet {
	
	String garment = "Nylon";
	String color = "Green";
	String comparment = "6 Comparments";
	double price = 50.00;
	int cash;
	
	int add(int x) {
		System.out.println("Add cash " + (cash + x));
		return cash += x;
	}
	
	int get(int x) {
		System.out.println("Get cash " + (cash - x));
		return cash -= x;
	}
	
	void look() {
		System.out.println("Money left is " + cash);
	}


}
