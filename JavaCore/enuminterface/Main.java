package enuminterface;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Enumeration<String> days;
	      Vector<String> dayNames = new Vector<>();
	      //Thêm dữ liệu
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();

	      //Duyệt và hiển thị các phần tử
	      while (days.hasMoreElements()){
	         System.out.println(days.nextElement()); 
	      }
	}
}
