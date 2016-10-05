package collection;
import java.util.*;
public class MapCollection {
	Map<Integer,String> mapColection= new HashMap<>();
	//Thêm dữ liệu vào Map
	public void addData() {
		mapColection.put(1,"A");
		mapColection.put(2,"C");
		mapColection.put(3,"E");
		mapColection.put(4,"G");
		mapColection.put(5,"B");
	}
	
//	public void showData() {
//		System.out.println("Các phần tử của HashMap là:");
//		System.out.println("\t"+ mapColection);
//	}
	 // Xuất từng phần tử key và value
	 public void showData() {
		System.out.println("Các phần tử của HashMap là:");
		Set<Map.Entry<Integer, String>> set = mapColection.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
	         Map.Entry me = (Map.Entry)iterator.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}
}
