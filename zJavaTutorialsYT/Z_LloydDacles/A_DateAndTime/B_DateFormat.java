package A_DateAndTime;

import java.text.*;
import java.util.Date;

public class B_DateFormat { // Or another class name

	public static void main(String[] args) {

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));
	}
}
