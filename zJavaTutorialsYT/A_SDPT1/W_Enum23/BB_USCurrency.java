package W_Enum23;

public enum BB_USCurrency {
	
	PENNY(0.01f, "Penny"), NICKLE(0.05f, "Nickle"), DIME(0.1f, "Dime"), QUARTER(0.25f);
	
	float value;
	String name;

	BB_USCurrency(float value) {
		this.value = value;
	}
	
	BB_USCurrency(float value, String name) {
		this.value = value;
		this.name = name;
	}

}
