package date;

import java.text.ParseException;

public class Main {

public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateMethod dateMethod= new DateMethod();
		dateMethod.getTimeCurent();
		dateMethod.getDateCurent();
		
		//So sánh 2 ngày, convert cùng định dạng để so sánh
		
		
		String myDate= "30/09/2016";
		dateMethod.compareDate(myDate); // gọi hàm so sánh
		
	
	}
	

}
