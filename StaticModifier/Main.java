package StaticModifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary salary= new Salary();
		System.out.println("Lương ban đầu là :"+ salary.getLuong());
		for(int i=0; i<3;i++){
			salary.tangLuong(3000);
		}
		System.out.println("Lương hiện tại là :"+ salary.getLuong());

	}

}
