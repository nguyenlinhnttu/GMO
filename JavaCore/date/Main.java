package date;

import java.text.ParseException;

public class Main {

public static void main(String[] args) throws ParseException {
		
		//create obj
		DateMethod dateMethod = new DateMethod();
		dateMethod.getTimeCurent();
		dateMethod.getDateCurent();
		//Call method
		String myDate = "30/7/2016";
		dateMethod.compareDate(myDate); 
		dateMethod.dateBefore(myDate);
		dateMethod.getMilitime();
	}
}
