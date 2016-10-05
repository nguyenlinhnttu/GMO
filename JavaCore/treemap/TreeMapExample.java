package treemap;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//Tạo một treemap
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		// Thêm các phần tử vào treeMap
		treeMap.put(1, "Quả cam");
		treeMap.put(2, "Quả Mít");
		treeMap.put(3, "Quả Hồng");

		//Lấy toàn bộ các entry của treemap
		Set set= treeMap.entrySet();

		//Tạo một iterator để duyệt 
		Iterator  iterator = set.iterator();  
		//Duyệt và hiển thị các phần tử
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// Trả về một phần của map có key nhỏ hơn giá trị nhập vào
		SortedMap<Integer, String> map=treeMap.headMap(3);
		System.out.println(map);

		//Trả về các key trong treemap
		Set<Integer> keyMap= treeMap.keySet();
		System.out.println("Danh sách các key: " +keyMap);
		
		//Trả về các value được chứa trong map
		Collection collection= treeMap.values();
		System.out.println("Danh sách các value: " +collection);

	}
}
