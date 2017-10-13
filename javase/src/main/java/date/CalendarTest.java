package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期运算
 */
public class CalendarTest {

	public static void main(String[] args) {
		getMD();
	}

	/**
	 * 获得月,天
	 */
	static void getMD() {
		
		SimpleDateFormat  sim = new  SimpleDateFormat("yyyyMMddhhmmss");
		
		Date date = null;
		try {
			date = sim.parse("20161129095518");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(date.toString());
		
		java.util.Calendar calendar = java.util.Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(java.util.Calendar.YEAR, +1);
		
		System.out.println(calendar.get(java.util.Calendar.MONTH));
		
		System.out.println( sim.format(calendar.getTime()) );
		
		
		java.util.Calendar now = java.util.Calendar.getInstance();
		now.add(java.util.Calendar.MONTH, 1);
		System.out.println(now.getTime()); 
		
	}
}
