package fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamModel {

	private static final String OUTPUT_FILE =
			"C:/Users/MyPc/Downloads/output.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Gọi hàm ghi file
		writeFile(OUTPUT_FILE);
	}
	//Ghi dữ liệu vào file
	public static void writeFile(String pathName) throws IOException {
		String content = "Test File Output Streammmmm";
		byte[] contentByte= content.getBytes();
		FileOutputStream outWriter=null;
			try {
				outWriter= new FileOutputStream(OUTPUT_FILE);
                outWriter.write(contentByte);// ghi vào file
                outWriter.flush();
              } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {               
                    if (outWriter != null) {
                        outWriter.close();
                     }
              }		
		}
}
