package serialization;

import java.io.Serializable;

public class SinhVien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maSV;
	private String hoTen;
	private String maLop;
	private String diaChi;
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public SinhVien(int maSV, String hoTen, String maLop, String diaChi) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.maLop = maLop;
		this.diaChi = diaChi;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
