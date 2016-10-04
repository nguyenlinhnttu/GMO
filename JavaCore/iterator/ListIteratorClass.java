package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorClass {
	ArrayList<String> arrayList= new ArrayList<>();
	//Thêm dữ liệu
	public void addItems() {
		arrayList.add("Linh");
		arrayList.add("Kim");
		arrayList.add("Thanh");
		arrayList.add("Tuấn");
	}

	//Duyệt và thay đổi giá trị trong khi duyệt
	public void changeWithListIterator() {
		ListIterator<String> listIterator= arrayList.listIterator();
		while (listIterator.hasNext()) {
			String value =listIterator.next();
			if (value.equals("Linh")) {
				listIterator.set("Nguyễn Văn Linh");
			} else if(value.equals("Kim")) {
				listIterator.set("Dư Ngọc Kim");
			}
		}
	}

	// Hiển thị đã dữ liệu sau khi đã thay đổi
	public void showList() {
		System.out.println("Nội dung của ArrayList sau khi thay đổi là:");
		ListIterator<String> listIterator= arrayList.listIterator();
		while (listIterator.hasNext()) {
			String value= listIterator.next();
			System.out.println(value);
		}
	}
}
