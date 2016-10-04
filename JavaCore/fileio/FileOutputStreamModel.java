package fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.jws.Oneway;

public class FileOutputStreamModel {

	private static final String OUTPUT_FILE =
			"C:/Users/MyPc/Downloads/output.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gọi hàm ghi file
		writeFile(OUTPUT_FILE);
	}
	//Ghi dữ liệu vào file
	public static void writeFile(String pathName) {
		String content = "Test File Output Stream";
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
