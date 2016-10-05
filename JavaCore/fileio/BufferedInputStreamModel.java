package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamModel {
	private static final String INPUT_FILE =
			"C:/Users/MyPC/Downloads/input.txt";
	
	public static void main(String[] args) {
		
		//Tạo mối đối tượng StringBuilder
		StringBuilder builder = new StringBuilder();
		try {
			BufferedInputStream inputStream= new BufferedInputStream(new 
					FileInputStream(INPUT_FILE));
			
			int byteRead= inputStream.available(); //Số byte có thể đọc
			
			while (inputStream.available()>0) {
				//Đọc dữ liệu và thêm vài builder
				builder.append((char)inputStream.read());
			}
			//Số byte có thể đọc được
			System.out.println("Số byte được đọc: "+byteRead);
			//Xuất dữ liệu	
			String value= builder.toString();
			System.out.println(value);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
