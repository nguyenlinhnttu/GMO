package linkedlist;
import java.util.*;
public class DataLinked {
	LinkedList<String> linkedList = new LinkedList<>();
	// Add data 
	public void addItem() {
		linkedList.add("Linh");
		linkedList.add("Kim");
		linkedList.add("Minh");
		linkedList.add("Thuyết");
		linkedList.add("Khải");
	}

	// show all data linkedList
	public void showList() {
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("Phần tử thứ  " + i 
			                   + " có giá trị là: " + linkedList.get(i));
		}
	}

	// add item first 
	public void addFirstItem(String giaTri) {
		linkedList.addFirst(giaTri);
	}

	//add item with post
	public void addItemWithPosition(int pos,String giaTri) {
		linkedList.add(pos, giaTri);
	}

	// Change value item
	public void changeItemWithPos(int pos, String giaTri) {
		linkedList.set(pos, giaTri);
		System.out.println("Vị trí thứ: " + pos 
		                + " thay đổi thành: " + linkedList.get(pos));
	}
	
	// Show data
	public void listIterator() {
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
          System.out.println(iterator.next());
        }
    }
}
