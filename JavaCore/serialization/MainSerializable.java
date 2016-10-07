package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializable {
	private static final String OUTPUT_FILE =
			"C:/Users/MyPC/Downloads/input.txt";
	public static void main(String[] args) throws Exception {
		//create obj
	    SinhVien sinhVien = new SinhVien();
	
		// write data to file
		sinhVien.setMaSV(1311519597);
		sinhVien.setHoTen("Nguyễn Văn Linh");
		sinhVien.setDiaChi("Quận 12");
		sinhVien.setMaLop("13DTH02");
		SerialObject(sinhVien);
	
		// read data and add to object
		sinhVien =(SinhVien) DeserialObject();
		System.out.println(sinhVien.getHoTen());
		System.out.println(sinhVien.getDiaChi());
		System.out.println(sinhVien.getMaLop());
	}

	//write data with SerialObject
	public static void SerialObject(Object obj) throws Exception {
        	FileOutputStream fs = new FileOutputStream(OUTPUT_FILE);
        	ObjectOutputStream os = new ObjectOutputStream(fs);
        	os.writeObject(obj);
        	//close
        	fs.close();
        	os.close();
    	}

  	// get data input.txt to objects
	 public static Object DeserialObject() throws Exception {
	        Object sinhVien=null;
	        FileInputStream fi=new FileInputStream(OUTPUT_FILE);
	        ObjectInputStream ois=new ObjectInputStream(fi);
	        sinhVien=ois.readObject();
	        fi.close();
	        ois.close();
	        return sinhVien;
	    }
}
