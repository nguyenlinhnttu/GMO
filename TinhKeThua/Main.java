package TinhKeThua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmBe eb= new EmBe("Linh",2,"Ở nhà",100,5);
		System.out.println("Tên là: "+eb.getName()+
							"\nTuổi: "+eb.getTuoi()+
							"\nChiều cao: "+eb.getHeight()+
							"\nCân nặng:" +eb.getWeight());
		eb.tapDi(10);
	}

}
