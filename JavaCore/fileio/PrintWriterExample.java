﻿package fileio;

import java.io.PrintWriter;
import java.util.Date;

public class PrintWriterExample {
    
	public static void main(String[] args) {
		  String name = "Nguyễn Văn Linh";
	      String address= "Quận 12";
	      String birthDay ="16/02/1995";
	      try {
	         // create  writer
	         PrintWriter pw = new PrintWriter(System.out);

	         pw.println(name);
	         pw.append("Địa chỉ ");
	         pw.println(address);
	         pw.checkError();
	         pw.print(birthDay);
	         // Đẩy dữ liệu
	         pw.flush();
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	}
}
