package enuminterface;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
	      Enumeration<String> days;
	      Vector<String> dayVector = new Vector<>();
	      //add data
	      dayVector.add("Sunday");
	      dayVector.add("Monday");
	      dayVector.add("Tuesday");
	      dayVector.add("Wednesday");
	      dayVector.add("Thursday");
	      dayVector.add("Friday");
	      dayVector.add("Saturday");
	      days = dayVector.elements();

	      // Show all data
	      while (days.hasMoreElements()){
	        String day = days.nextElement(); 
	         if (day.equals("Sunday")) {
	             System.out.println("Ngày Cuối tuần ! ");
	         } else {
	             System.out.println(day);
	         }
	      }
	}
}
