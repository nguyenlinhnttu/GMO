package hashset;
import java.util.*;
public class DataHashSet {
    HashSet<String> hashSet= new HashSet<>();
    
	// Add data
	public void addItems() {
		hashSet.add("Linh");
		hashSet.add("Kim");
		hashSet.add("Minh");
		hashSet.add("Thuyết");
	}

	// Show data
	public void showHashSet() {
		System.out.println(hashSet);
	}

	//check hashSet empty
	public void checkHashEmpty() {
		boolean isEmpty = hashSet.isEmpty();
		if (isEmpty == true) {
			System.out.println("HashSet Rỗng!");
		} else {
			System.out.println("HashSet có phần tử!");
		}
	}

	// delete item with value
	public void removeItem(String giaTri) {
		boolean isRemove = hashSet.remove(giaTri);
		if (isRemove == true) {
			System.out.println("Đã xóa phần tử: " + giaTri);
		} else {
			System.out.println("Không có phần tử này trong Hash!");
		}
	}

	// check item if exits
	public void containsItem(String giaTri) {
		boolean isContain =hashSet.contains(giaTri);
		if (isContain == true) {
			System.out.println(giaTri + " Tồn tại!");
		} else {
			System.out.println("Gía trị này không tồn tại trong hash.");
		}
	}
}
