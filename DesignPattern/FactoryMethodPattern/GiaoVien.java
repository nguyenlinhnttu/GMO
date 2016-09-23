package FactoryMethodPattern;

abstract class GiaoVien {
	public abstract LOPHOC getLOPHOC();
	public void thongBaoNghiHoc() {
		LOPHOC lophoc= getLOPHOC();
		lophoc.getName();
		LOPHOC child= lophoc.tbNghiHoc(); 
	}
}
