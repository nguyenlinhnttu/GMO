package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//Khởi tạo một đối tượng
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
		//Thêm dữ liệu
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("for");
		//Duyệt một linkedHashSet
		Iterator iterator= linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
	}
}
