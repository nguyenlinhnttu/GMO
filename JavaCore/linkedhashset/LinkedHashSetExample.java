package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//new obj
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		//add data
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("for");
		
		//Show data
		Iterator iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
	}
}
