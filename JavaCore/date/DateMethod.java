package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMethod {
	
	Date date = new Date();
	DateFormat formatter ;
	String dateFormatted ;
	
	// get time curent
	public void getTimeCurent() {
	    formatter = new SimpleDateFormat("HH:mm:ss");
        dateFormatted = formatter.format(date);
        System.out.println(dateFormatted);
	}
	//get date curent
	public void getDateCurent() {
	    formatter = new SimpleDateFormat("dd/MM/yyyy");
        dateFormatted = formatter.format(date);
        System.out.println(dateFormatted);
	}
	
	//compare mydate with curentday
	public void compareDate(String myDate) throws ParseException {
	    formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        // Convert myDate to Date
        Date convertMyDate;
        convertMyDate = formatter.parse(myDate);
        
        Date toDay;
        toDay = formatter.parse(dateFormatted);
        // compare
        if (toDay.compareTo(convertMyDate)<0) {
            System.out.println("Today nhỏ hơn " + myDate);
        } else if (toDay.compareTo(convertMyDate)>0) {
            System.out.println("Today lớn hơn " + myDate);
        } else {
            System.out.println("Today bằng với " + myDate);
        }
	}
	//Check mydate with curentday 
	public void dateBefore(String myDate) throws ParseException {
	    formatter = new SimpleDateFormat("dd/MM/yyyy"); 
	    // Convert myDate to Date
        Date convertMyDate;
        convertMyDate = formatter.parse(myDate);
        // get curentday
        Date toDay = new Date();
        //Call before method
        boolean check = toDay.before(convertMyDate);
        if (check == true) {
            System.out.println("Ngày nhập vào lớn hơn ngày hiện tại");
        } else {
            System.out.println("Ngày nhập vào nhỏ hơn ngày hiện tại");
        }
    }
	
	public void getMilitime() {
	    Date toDay = new Date();
	    long militime = toDay.getTime();
	    System.out.println(militime);  
	}
}
