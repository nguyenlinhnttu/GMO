package collection;
import java.util.*;
public class ListCollection {
	List<Integer> listData = new ArrayList<>();
	
	public void addData() {
		listData.add(1);
		listData.add(2);
		listData.add(3);
		listData.add(4);
		listData.add(5);
		listData.add(6);
	}
	
	public void showData() {
		System.out.println("Các phần tử của ArrayList là:");
		System.out.println("\t"+ listData);
	}
}