package TinhKeThua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmBe eb= new EmBe("Linh",2,"Quận 12 ",100,5);
		System.out.println("Tên: "+eb.getName()+
							"\nTuổi: "+eb.getTuoi()+
							"\nĐịa chỉ: "+eb.getDiachi()+
							"\nChiều cao: "+eb.getHeight()+
							"\nCân nặng:" +eb.getWeight());
		eb.tapDi(10); 	// hàm tập đi
	}
}
