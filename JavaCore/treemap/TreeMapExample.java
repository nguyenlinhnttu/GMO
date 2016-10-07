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
		//create treemap
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		//add data treeMap
		treeMap.put(1, "Quả cam");
		treeMap.put(2, "Quả Mít");
		treeMap.put(3, "Quả Hồng");

		//get entry of treemap
		Set set = treeMap.entrySet();
		Iterator  iterator = set.iterator();  
		//Show data 
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// return map with key> 3
		SortedMap<Integer, String> map = treeMap.headMap(3);
		System.out.println(map);

		//return all key
		Set<Integer> keyMap = treeMap.keySet();
		System.out.println("Danh sách các key: " + keyMap);
		
		//return all value
		Collection collection = treeMap.values();
		System.out.println("Danh sách các value: " + collection);

	}
}
