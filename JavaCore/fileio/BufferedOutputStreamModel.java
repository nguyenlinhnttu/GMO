package fileio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamModel {
	private static final String OUTPUT_FILE =
			"C:/Users/LynkMieu/Downloads/filetest.txt";

	public static void main(String[] args) {
		//Sử dụng BufferedOutputStream ghi dữ liệu xuống file
		try {
			BufferedOutputStream stream = new BufferedOutputStream(
							new FileOutputStream(OUTPUT_FILE));
			//Ghi dữ liệu
			stream.write("Nguyễn Văn Linh".getBytes());
			stream.write(System.lineSeparator().getBytes()); // Xuống hàng
			stream.write("Dư Ngọc kim".getBytes());
			
			stream.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		//Gọi hàm đọc dữ liệu đã viết bên class FileInputStreamModel 
		FileInputStreamModel fisModel= new FileInputStreamModel();
		fisModel.readFile(OUTPUT_FILE);
	}
}
