package fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamModel {

	private static final String OUTPUT_FILE =
			"C:/Users/MyPc/Downloads/output.txt";
	public static void main(String[] args) throws IOException {
	    //Call method writeFile
		writeFile(OUTPUT_FILE);
	}
	
    // Write data to file
    public static void writeFile(String pathName) throws IOException {
        String content = "Test File Output Streammmmm";
        byte[] contentByte = content.getBytes();
        FileOutputStream outWriter = null;
        try {
            outWriter = new FileOutputStream(OUTPUT_FILE);
            outWriter.write(contentByte);
            outWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outWriter.close();
        }
    }
}
