package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamModel {
	private static final String FILE_PATH="C:/Users/LynkMieu/Downloads/abc.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile(FILE_PATH);
	}
	public static void readFile(String resource ) {

		File file = new File(resource);
		FileInputStream fis = null;
		try {
			// Tạo object FileInputStream
			fis = new FileInputStream(file);

			byte fileContent[] = new byte[(int)file.length()];
			// Đọc dữ liệu
			fis.read(fileContent);
			//Tạo String từ byte fileContent
			String s = new String(fileContent);
			System.out.println(s);
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found" + e);
		}
		catch (IOException ioe) {
			System.out.println("Exception while reading file " + ioe);
		}
		finally {
			// Close Stream
			try {
				if (fis != null) {
					fis.close();
				}
			}
			catch (IOException ioe) {
				System.out.println("Error while closing stream: " + ioe);
			}
		}
		
	}
}
