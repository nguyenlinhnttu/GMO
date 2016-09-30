package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamModel {
	private static final String INPUT_FILE =
			"C:/Users/LynkMieu/Downloads/filetest.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new  StringBuilder();
		try {
			BufferedInputStream inputStream= new BufferedInputStream(new 
					FileInputStream(INPUT_FILE));
			while (inputStream.available()>0) {
				builder.append((char)inputStream.read());
			}	
			String value= builder.toString();
			System.out.println(value);
			inputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
