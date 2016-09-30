package fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.jws.Oneway;

public class FileOutputStreamModel {

	private static final String OUTPUT_FILE =
			"C:/Users/LynkMieu/Downloads/filetest.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gọi hàm ghi file
		writeFile(OUTPUT_FILE);
		//Gọi hàm đọc dữ liệu
		FileInputStreamModel fisModel= new FileInputStreamModel();
		fisModel.readFile(OUTPUT_FILE);
	}
	
	public static void writeFile(String fileName) {
		String content = "Test File Output Stream";
		char[] chars = content.toCharArray();
		
		try(BufferedWriter outWriter = new BufferedWriter(new
				OutputStreamWriter(new FileOutputStream(OUTPUT_FILE),"utf-8"),1024)){
				
				outWriter.write(content); // ghi vào file
				outWriter.newLine();
				outWriter.write("Nguyễn Văn Linh");
			
		}
		catch(IOException e){
			 e.printStackTrace();

		}
	}
	
}
