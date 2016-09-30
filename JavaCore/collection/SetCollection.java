package collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
	Set<String> setList = new  HashSet<>();
	
	public void addData() {
		setList.add("A");
		setList.add("C");
		setList.add("E");
		setList.add("G");
		setList.add("B");
	}
	
	public void showData() {
		System.out.println("Các phần tử của HashSet là:");
		System.out.println("\t"+ setList);
	}
}
