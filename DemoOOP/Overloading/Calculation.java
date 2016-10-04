package Overloading;

class Calculation{  
	// Hàm sum với 2 tham số
	void sum(int giaTri1, int giaTri2){
		int tong=giaTri1+giaTri2;
		System.out.println(tong);
	}
	// Hàm sum với 3 tham số
	void sum(int giaTri1, int giaTri2,int giaTri3){
		int tong= giaTri1+ giaTri2+ giaTri3;
		System.out.println(tong);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation= new Calculation();
		calculation.sum(10, 15);
		calculation.sum(11, 12, 13);
	}
}
