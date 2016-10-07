package treeset;
import java.util.*;
public class DataTreeSet {
	TreeSet<Integer> treeSet= new TreeSet<>();
	
	// add data,(data auto sort)
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
	
	//Show data
	public void showItems() {
		System.out.println(treeSet);
	}

	//get first item
	public void getFirstItem() {
		int firstItem = treeSet.first();
		System.out.println("Phần tử đầu tiên trong treeset là: " + firstItem);
	}

	//get last item
	public void getLastItem() {
		int lastItem= treeSet.last();
		System.out.println("Phần tử cuối cùng trong treeset là: " + lastItem);
	}

	//Clone  treeset
	public void cloneTreeSet() {
		Object cloneTree = treeSet.clone();
		System.out.println("Tree set được clone: " + cloneTree);
	}

	//Sorted Set 
	public void sortedSet(int fromElement, int toElement) {
		SortedSet<Integer> subSet = treeSet.subSet(fromElement, toElement);
		System.out.println("SubSet sau khi được Sorted: ");
		System.out.println(subSet);
	}

	//get value greater or equal
	public void tailSet(int giaTri) {
		SortedSet<Integer> sortedSet = treeSet.tailSet(giaTri);
		System.out.println("Các giá trị lớn hơn hoặc bằng "+ giaTri);
		System.out.println(sortedSet);
	}
}
