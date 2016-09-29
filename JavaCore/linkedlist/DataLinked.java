package linkedlist;
import java.util.*;
public class DataLinked {
	LinkedList<String> linkedList = new LinkedList<>();
	// Add item vào list
	public void addItem() {
		linkedList.add("Linh");
		linkedList.add("Kim");
		linkedList.add("Minh");
		linkedList.add("Thuyết");
		linkedList.add("Khải");
	}
	// Hiển thị các phần tử trong linkedList
	public void showList() {
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("Phần tử thứ  "+ i +" có giá trị là: " +linkedList.get(i));
		}
	}
	// Thêm một phần tử vào đầu list
	public void addFirstItem(String giaTri) {
		linkedList.addFirst(giaTri);
	}
	//Thêm vào vị trí chỉ định
	public void addItemWithPosition(int pos,String giaTri) {
		linkedList.add(pos, giaTri);
	}
	// Lấy một vị trí và thay đổi giá trị
	public void changeItemWithPos(int pos, String giaTri) {
		//Object value=linkedList.get(pos); // lấy giá trị cũ
		linkedList.set(pos, giaTri);
		System.out.println("Vị trí thứ: "+pos +" thay đổi thành: "+ linkedList.get(pos));
		
	}
	
}
