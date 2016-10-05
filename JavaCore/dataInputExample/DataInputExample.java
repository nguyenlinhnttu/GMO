package dataInputExample;
import java.io.*;
public class DataInputExample {
	private static final String OUTPUT_FILE =
			"C:/Users/MyPC/Downloads/input.txt";

	public static void main(String[] args) throws IOException {
		  int n = 10;
		  long[] a = {1000,1111,2222,3333};
		  String hello ="Hello, My name is Linh!";
		  byte[] helloByte = hello.getBytes();
		 // Ghi dữ liệu xuống file Text
		 try {
			OutputStream ops= new FileOutputStream(OUTPUT_FILE);
			DataOutputStream dataOutputStream = new DataOutputStream(ops);
			
			dataOutputStream.writeInt(n);
			for (int i = 0; i < a.length; i++) {
				dataOutputStream.writeLong(a[i]);		
			}
			dataOutputStream.write(n);
			dataOutputStream.write(helloByte);
			
			dataOutputStream.close();
			ops.close();
			
		} catch (Exception e) {
			System.out.println("Lỗi: "+e);
		}
		 readFile();
	}
	public static void readFile() throws IOException {
	    try {
            DataInputStream d = new DataInputStream(new 
                    FileInputStream(OUTPUT_FILE));
            String content;
            while((content= d.readLine())!=null){
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    
    }
}
