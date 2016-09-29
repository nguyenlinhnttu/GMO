package Overloading;

class Calculation{  
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void sum(int a, int b,int c){
		int tong= a+b+c;
		System.out.println(tong);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation= new Calculation();
		calculation.sum(10, 15);
		calculation.sum(11, 12,13);
	}
}
