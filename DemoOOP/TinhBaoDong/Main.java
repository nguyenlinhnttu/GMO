package TinhBaoDong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tính Bao đóng
		People people= new People();
		//Sử dụng getter setter để truy nhập tới biến
		people.setName("Nguyễn Văn Linh");
		people.setTuoi("21 Tuổi");
		System.out.println(people.getName() +"\n"+people.getTuoi());
	}

}
