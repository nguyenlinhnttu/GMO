package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamModel {
	private static final String INPUT_FILE =
			"C:/Users/LynkMieu/Downloads/filetest.txt";
	public static void main(String[] args) {
		
		//Tạo mối đối tượng StringBuilder
		StringBuilder builder = new  StringBuilder();
		try {
			BufferedInputStream inputStream= new BufferedInputStream(new 
					FileInputStream(INPUT_FILE));
			while (inputStream.available()>0) {
				//Đọc dữ liệu và thêm vài builder
				builder.append((char)inputStream.read());
			}
			//Xuất dữ liệu	
			String value= builder.toString();
			System.out.println(value);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
