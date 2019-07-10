package essentialclasses;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double num = 12345678.9101112;
		
		Locale locale = new Locale("it", "IT");
		
		NumberFormat formatter = 
				NumberFormat.getCurrencyInstance(locale);
		
		
		System.out.println(formatter.format(num));
	}

}
