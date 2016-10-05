package fileio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamModel {
	private static final String OUTPUT_FILE =
			"C:/Users/MyPC/Downloads/input.txt";

	public static void main(String[] args) throws IOException {
		
	    //Sử dụng BufferedOutputStream ghi dữ liệu xuống file
	    BufferedOutputStream stream = null;
		try {
			stream = new BufferedOutputStream(
							new FileOutputStream(OUTPUT_FILE));
			//Ghi dữ liệu
			stream.write("Nguyễn Văn Linh".getBytes());
			stream.write(System.lineSeparator().getBytes()); // Xuống hàng
			stream.write("Dư Ngọc kim".getBytes());
			stream.flush();  //Đẩy dữ liệu đảm bảo dữ liệu trên bộ nhớ đệm ko mất đi
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
		    stream.close();
        }
	}
}
