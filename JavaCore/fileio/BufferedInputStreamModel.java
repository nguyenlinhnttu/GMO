package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamModel {
	private static final String INPUT_FILE = "C:/Users/MyPC/Downloads/input.txt";
	
	public static void main(String[] args) {
		
		//create StringBuilder obj
		StringBuilder builder = new StringBuilder();
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new 
					FileInputStream(INPUT_FILE));
			int byteRead = inputStream.available(); 
			
			while (inputStream.available()>0) {
	            //read data and append builder
                builder.append((char)inputStream.read());
			}
			System.out.println("Số byte được đọc: " + byteRead);
	        String value = builder.toString();
	        System.out.println(value);
	        inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
