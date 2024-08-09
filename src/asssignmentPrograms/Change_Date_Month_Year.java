package asssignmentPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Change_Date_Month_Year {

	public static void main(String[] args) throws ParseException {
		
		String date="2023-05-01";
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar c= Calendar.getInstance();
		c.setTime(dateFormat.parse(date));
		c.add(Calendar.DATE, 10);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.YEAR, 1);
		date=dateFormat.format(c.getTime());
		System.out.println(date);

	}

}
