package hashset;

public class Main {

	public static void main(String[] args) {
		DataHashSet dataHashSet= new DataHashSet();
		//Call method
		dataHashSet.addItems();
		dataHashSet.showHashSet();
		dataHashSet.checkHashEmpty();
		dataHashSet.containsItem("Linh");
		dataHashSet.removeItem("Kim");
		System.out.println("HashSet hiện tại là:");
		dataHashSet.showHashSet();
	}
}
