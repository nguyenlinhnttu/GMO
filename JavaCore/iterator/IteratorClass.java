﻿package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
	ArrayList<String> arrayList= new ArrayList<>();
	//add data
	public void addItems() {
		arrayList.add("Linh");
		arrayList.add("Kim");
		arrayList.add("Thanh");
		arrayList.add("Tuấn");
	}

	//Show data
	public void showList() {
		System.out.println("Nội dung của ArrayList là:");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
	}
}
