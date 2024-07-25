package W_Enum23;

public class B_EnumsValue {

	public static void main(String[] args) {
	
		BB_USCurrency money = BB_USCurrency.NICKLE;
		System.out.println(money.value);

		// created an array out of Enum Class
		BB_USCurrency coins[] = new BB_USCurrency[3];
		coins[0] = BB_USCurrency.DIME;
		coins[1] = BB_USCurrency.NICKLE;
		coins[2] = BB_USCurrency.QUARTER;
		
	
		for(BB_USCurrency coin: coins) {
			System.out.println(coin.name);
		}
		
		
		
	}

}
