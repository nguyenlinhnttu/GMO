package dataInputExample;
import java.io.*;
public class DataInputExample {
	private static final String OUTPUT_FILE =
			"C:/Users/LynkMieu/Downloads/Data.txt";

	public static void main(String[] args) {
		  int n=10;
		  long a[]={1000,1111,2222,3333};
		  String hello ="Hello, My name is Linh!";
		 // Ghi dữ liệu xuống file Text
		 try {
			OutputStream ops= new FileOutputStream(OUTPUT_FILE);
			DataOutputStream dataOutputStream = new DataOutputStream(ops);
			
			dataOutputStream.writeInt(n);
			for (int i = 0; i < a.length; i++) {
				dataOutputStream.writeLong(a[i]);
			}
			dataOutputStream.writeBytes(hello);
			dataOutputStream.close();
			ops.close();
			
		} catch (Exception e) {
			System.out.println("Lỗi: "+e);
		}
	}

}
