package hashset;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHashSet dataHashSet= new DataHashSet();
		dataHashSet.addItems();
		dataHashSet.showHashSet();
		dataHashSet.checkHashEmpty();
		dataHashSet.containsItem("Linh");
		dataHashSet.removeItem("Kim");
		System.out.println("HashSet hiện tại là:");
		dataHashSet.showHashSet();
		
	}

}
