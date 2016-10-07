package iterator;

public class Main {

	public static void main(String[] args) {
		//Use Iterator
		IteratorClass iterator = new IteratorClass();
		iterator.addItems();
		iterator.showList();
		
		// Use ListIterator change value
		ListIteratorClass listIterator = new ListIteratorClass();
		listIterator.addItems();
		listIterator.changeWithListIterator();
		listIterator.showList();
	}
}
