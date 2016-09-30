package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethod {
	
	Date date= new Date();
	DateFormat formatter ;
	String dateFormatted ;
	
	// lấy thời gian hiện tại
	public void getTimeCurent() {
		formatter = new SimpleDateFormat("HH:mm:ss");
		dateFormatted = formatter.format(date);
		System.out.println(dateFormatted);
		//System.out.println(date.toString());
	}
	//Lấy ngày tháng hiện tại
	public void getDateCurent() {
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		dateFormatted = formatter.format(date);
		System.out.println(dateFormatted);
		//System.out.println(date.toString());
	}
	
	//So sánh hai ngày
	public void compareDate(String myDate) throws ParseException {
		
		formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		// Convert myDate to Date
		Date convertMyDate;
		convertMyDate = formatter.parse(myDate);
		// Lấy ngày hiện tại kiểu Date
		Date toDay;
		toDay = formatter.parse(dateFormatted);
	
		// So sánh với ngày nhập vào
		if(toDay.compareTo(convertMyDate)<0){
			System.out.println("Today nhỏ hơn " + myDate);
		}
		else if(toDay.compareTo(convertMyDate)>0) {
			System.out.println("Today lớn hơn " + myDate);
		}
		else {
			System.out.println("Today bằng với " + myDate);
		}
	
	}

	
}

