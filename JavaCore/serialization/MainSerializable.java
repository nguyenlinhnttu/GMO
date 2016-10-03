package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializable {
	private static final String OUTPUT_FILE =
			"C:/Users/LynkMieu/Downloads/Data.txt";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SinhVien sinhVien= new SinhVien();
	
		// Ghi dữ liệu xuống file
//		sinhVien.setMaSV(1311519597);
//		sinhVien.setHoTen("Nguyễn Văn Linh");
//		sinhVien.setDiaChi("Quận 12");
//		sinhVien.setMaLop("13DTH02");
//		SerialObject(sinhVien);
	
		// Đọc dữ liệu đã ghi đưa lên object
		sinhVien=(SinhVien) DeserialObject();
		System.out.println(sinhVien.getHoTen());
		System.out.println(sinhVien.getDiaChi());
	}
	public static void SerialObject(Object obj) throws Exception{
        //Tạo luồng ghi vào file OUTPUT_FILE
        FileOutputStream fs=new FileOutputStream(OUTPUT_FILE);
        //Tạo luồng để serial đối tượng
        ObjectOutputStream os=new ObjectOutputStream(fs);
        //chuyển tải đối tượng tới đích (tập tin)
        os.writeObject(obj);
        //đóng luồng
        fs.close();
        os.close();
    }
	// Lấy dữ liệu đã ghi lên objects
	 public static Object DeserialObject() throws Exception{
	        Object sinhVien=null;
	        //Tạo luồng đọc file đã được serial
	        FileInputStream fi=new FileInputStream(OUTPUT_FILE);
	        //Tạo luồng để Deserialize đối tượng
	        ObjectInputStream ois=new ObjectInputStream(fi);
	        //khôi phục đối tượng đổ vào object
	        sinhVien=ois.readObject();
	        //đóng luồng
	        fi.close();
	        ois.close();
	        return sinhVien;
	    }
}
