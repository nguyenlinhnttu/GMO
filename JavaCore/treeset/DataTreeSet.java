package treeset;
import java.util.*;
public class DataTreeSet {
	TreeSet<Integer> treeSet= new TreeSet<>();
	
	// Thêm dữ liệu mặc định vào treeset, dữ liệu được tự động sắp xếp
	public void addItems() {
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(10);
		treeSet.add(16);
	}
	public void showItems() {
		System.out.println(treeSet);
	}
	//lấy phần tử đầu tiên trong treeset
	public void getFirstItem() {
		int firstItem= treeSet.first();
		System.out.println("Phần tử đầu tiên trong treeset là: "+ firstItem);
	}
	//lấy phần tử đầu tiên trong treeset
	public void getLastItem() {
		int lastItem= treeSet.last();
		System.out.println("Phần tử cuối cùng trong treeset là: "+ lastItem);
	}
	//Clone một treeset
	public void cloneTreeSet() {
		Object cloneTree=treeSet.clone();
		System.out.println("Tree set được clone: " + cloneTree);
	}
	//Sorted Set theo tứ tự muốn lấy
	public void sortedSet(int fromElement, int toElement) {
		SortedSet<Integer> subSet= treeSet.subSet(fromElement, toElement);
		System.out.println("SubSet sau khi được Sorted: ");
		System.out.println(subSet);
	}
	//lấy các phần tử trong set lớn hơn hoặc bằng giá trị nhập vào
	public void tailSet(int giaTri) {
		SortedSet<Integer> sortedSet = treeSet.tailSet(giaTri);
		System.out.println("Các giá trị lớn hơn hoặc bằng "+ giaTri);
		System.out.println(sortedSet);
	}
}
