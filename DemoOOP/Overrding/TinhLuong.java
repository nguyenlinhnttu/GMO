package Overrding;

class TinhLuong extends Calculation{
	// tình tổng lương 
	void sum(int salary, int ngayCong){
		double tienLuong = salary*ngayCong;
		System.out.println(tienLuong);
	}
}