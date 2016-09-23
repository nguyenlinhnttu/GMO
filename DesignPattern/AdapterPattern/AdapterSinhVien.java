package AdapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AdapterSinhVien extends SinhVien implements ChiTietSinhVien {

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nhập tên SV :");  
			String tenSV =br.readLine();
			System.out.print("Nhập Mã SV:");  
			int maSV=Integer.parseInt(br.readLine());  
			System.out.print("Nhập lớp:");  
			String tenLop=br.readLine();  
			      
			setTenSV(tenSV);
			setTenLop(tenLop); 
			setMaSV(maSV);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		   System.out.print("\n");
	}

	@Override
	public String xuatThongTin() {
		// TODO Auto-generated method stub
		String tenSV= getTenSV();
		String tenLop= getTenLop();
		int maSV= getMaSV();
		String ttSV= "Tên sinh viên: "+tenSV +
					 "\nMã sinh viên: "+ maSV +
					 "\nThuộc lớp: " +tenLop;
		return ttSV;
	}

}
