package vector;
import java.util.Vector;
public class DataVector {
	static Vector<String> vector = new Vector<>();
	// Thêm dữ liệu vào Vector
	public void addItems() {
		vector.addElement("Giá trị 1");
		vector.addElement("Giá trị 2");
		vector.addElement("Giá trị 3");
		vector.addElement("Giá trị 4");
		
		int size= vector.capacity();
		System.out.println("Dung lương hiện tại của vector là: " +size);
	}

	//Lấy phần tử đầu tiên
	public void getFirstItem() {
		String firstItem= "-Phần tử đầu tiên là: "+vector.firstElement();
		System.out.println(firstItem);
	}

	//Lấy phần tử cuối cùng
	public void getLastItem() {
		String lastItem= "-Phần tử cuối cùng là: "+vector.lastElement();
		System.out.println(lastItem);
	}

	//Xóa phần tử theo object
	public void removeItem(String obj) {
		boolean isRemove= vector.remove(obj);
		if(isRemove==true){
			System.out.println("-Đã xóa phần tử: "+ obj);
		}
	}
		
	//Trả về biểu diễn chuỗi của vector cho mỗi phần tử
	public void converToString() {
		String converString= vector.toString();
		System.out.println("-Biểu diễn các phần tử dạng String:"+ converString);
	
	}	

	//Xóa toàn bộ vector
	public void deteteAllIteam() {
		 vector.removeAllElements();
		 System.out.println("-Vector sau khi xóa: " +vector);	
	}
	
}
