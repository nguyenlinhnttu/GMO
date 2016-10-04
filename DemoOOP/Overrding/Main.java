package Overrding;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation= new Calculation();
		calculation.sum(10, 15);
		// Gọi hàm tính lương bên class Tinhluong
		TinhLuong tinhLuong= new TinhLuong();
		tinhLuong.sum(3000,10);
	}
}
