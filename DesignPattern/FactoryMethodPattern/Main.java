package FactoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Thông báo cho lớp CTH	
	GiaoVien giaoVien= new GiaoVienCTH();
	giaoVien.thongBaoNghiHoc();
	// Thông báo cho lớp DTH
	GiaoVien giaoVien2= new GiaoVienDTH();
	giaoVien2.thongBaoNghiHoc();
	}

}
