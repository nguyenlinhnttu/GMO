package Overrding;

class TinhLuong extends Calculation{
	void sum(int salary, int ngayCong){
		double tienLuong= salary*ngayCong;
		System.out.println(tienLuong);
	}
}