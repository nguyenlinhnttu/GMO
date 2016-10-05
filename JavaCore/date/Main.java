package date;

import java.text.ParseException;

public class Main {

public static void main(String[] args) throws ParseException {
		
		//Tạo một obj
		DateMethod dateMethod= new DateMethod();
		dateMethod.getTimeCurent();
		dateMethod.getDateCurent();
		
		//So sánh 2 ngày, convert cùng định dạng để so sánh
		String myDate= "30/7/2016";
		dateMethod.compareDate(myDate); 	// gọi hàm so sánh
		
		//Kiểm tra ngày nhập vào lớn hơn hay nhỏ hơn ngày hiện tại
		dateMethod.dateBefore(myDate);
		
		//Trả về số giây đã trôi qua
		dateMethod.getMilitime();
	}
}
