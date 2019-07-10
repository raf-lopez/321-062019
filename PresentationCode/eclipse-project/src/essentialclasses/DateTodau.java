package essentialclasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTodau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("MMM d, yyyy");
		String result = sdf.format(today.getTime());
		System.out.println(result);
	}

}
