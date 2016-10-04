package calendar;

import java.util.Calendar;

public class MainCalendar {

	public static void main(String[] args) {

	      // Tạo một đối tượng Lịch mặc định.
	      Calendar c = Calendar.getInstance();
	      int year = c.get(Calendar.YEAR);
	      
	      // Trả về giá trị từ 0 - 11
	      int month = c.get(Calendar.MONTH);
	      int day = c.get(Calendar.DAY_OF_MONTH);
	      int hour = c.get(Calendar.HOUR_OF_DAY);
	      int minute = c.get(Calendar.MINUTE);
	      int second = c.get(Calendar.SECOND);
	      int millis = c.get(Calendar.MILLISECOND);
	      
	       // Hiển thị dữ liệu
	      System.out.println("Year: " + year);
	      System.out.println("Month: " + (month+1));
	      System.out.println("Day: " + day);
	      System.out.println("Hour: " + hour);
	      System.out.println("Minute: " + minute);
	      System.out.println("Second: " + second);
	      System.out.println("Minute: " + minute);
	      System.out.println("Milli Second: " + millis);
	}
}
