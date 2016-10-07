package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	private static final String FILE_PATH="C:\\Users\\LynkMieu\\Downloads\\fileExample.txt";
	private static File file;
	
	public static void main(String[] args) {
		//call method
		createFile(FILE_PATH);
		getInfoFile();
	}
	
	// create new file
	public static void createFile(String pathname) {
		 file = new File(pathname);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//get info file
	public static void getInfoFile() {
        System.out.println(file.getAbsolutePath());
        System.out.println("Tên của file là: " + file.getName());
        System.out.println("File này có tồn tại hay không: " + file.exists());
        System.out.println("File có thể đọc hay không: " + file.canRead()); 
        System.out.println("Độ dài của file: " + file.length());
	}
}
