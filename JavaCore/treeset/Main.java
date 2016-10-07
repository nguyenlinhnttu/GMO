package treeset;

public class Main {

	public static void main(String[] args) {
		DataTreeSet dataTreeSet = new DataTreeSet();
		//Call methos
		dataTreeSet.addItems();
		dataTreeSet.showItems();
		dataTreeSet.getFirstItem();
		dataTreeSet.getLastItem();
		dataTreeSet.cloneTreeSet();
		dataTreeSet.sortedSet(3,6); 
		dataTreeSet.tailSet(5);
	}
}
