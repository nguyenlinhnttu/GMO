package AdapterPattern;

public class Main {
	public static void main(String args[]){  
		  ChiTietSinhVien sinhVien=new AdapterSinhVien();  
		  sinhVien.nhapThongTin();
		 
		  System.out.print(sinhVien.xuatThongTin());  
		 }   
}
