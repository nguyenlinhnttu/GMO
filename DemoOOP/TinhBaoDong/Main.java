package TinhBaoDong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một đối tượng people
		People people= new People();
		//Sử dụng setter và getter để truy cập các biến
		people.setName("Nguyễn Văn Linh");
		people.setTuoi("21 Tuổi");
		System.out.println(people.getName() +"\n"+people.getTuoi());
	}
}
