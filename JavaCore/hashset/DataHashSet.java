package hashset;
import java.util.*;
public class DataHashSet {
	HashSet<String> hashSet= new HashSet<>();
	
//	Lưu ý trong HashSet các phần tử có giá trị trùng nhau sẽ bị ghi đè lên nhau
	
	// Thêm dữ liệu mặc định
	public void addItems() {
		hashSet.add("Linh");
		hashSet.add("Kim");
		hashSet.add("Minh");
		hashSet.add("Thuyết");
	}

	// Hiển thị các phần tử
	public void showHashSet() {
		System.out.println(hashSet);
	}

	//Kiểm tra có rỗng hay không
	public void checkHashEmpty() {
		boolean isEmpty= hashSet.isEmpty();
		if(isEmpty==true){
			System.out.println("HashSet Rỗng!");
		}else {
			System.out.println("HashSet có phần tử!");
		}
	}

	// Xóa một item trong hash
	public void removeItem(String giaTri) {
		boolean isRemove= hashSet.remove(giaTri);
		if(isRemove==true){
			System.out.println("Đã xóa phần tử: "+ giaTri);
		}else {
			System.out.println("Không có phần tử này trong Hash!");
		}
	}

	// Kiểm tra item có tồn tại trong hash hay không
	public void containsItem(String giaTri) {
		boolean isContain =hashSet.contains(giaTri);
		if(isContain==true){
			System.out.println(giaTri+" Tồn tại!");
		}
		else {
			System.out.println("Gía trị này không tồn tại trong hash.");
		}
	}
}
