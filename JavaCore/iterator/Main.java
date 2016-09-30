package iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IteratorClass iterator= new IteratorClass();
		iterator.addItems();
		iterator.showList();
		
		// Sử dụng ListIterator thay đổi value
		ListIteratorClass listIterator= new ListIteratorClass();
		listIterator.addItems();
		listIterator.changeWithListIterator();
		listIterator.showList();
	}

}
