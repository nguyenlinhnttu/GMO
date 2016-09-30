package treeset;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTreeSet dataTreeSet = new DataTreeSet();
		dataTreeSet.addItems();
		dataTreeSet.showItems();
		dataTreeSet.getFirstItem();
		dataTreeSet.getLastItem();
		dataTreeSet.cloneTreeSet();
		dataTreeSet.sortedSet(3,6); 
		dataTreeSet.tailSet(5);
	}

}
