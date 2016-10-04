import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamModel {
	private static final String FILE_INPUT="C:/Users/MyPC/Downloads/input.txt";
	private static final String FILE_OUTPUT="C:/Users/MyPC/Downloads/output.txt";
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream(FILE_INPUT);
	         out = new FileOutputStream(FILE_OUTPUT);
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }


}
