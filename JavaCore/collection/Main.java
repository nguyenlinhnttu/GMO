package collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListCollection listCollection= new ListCollection();
		listCollection.addData();
		listCollection.showData();
		
		SetCollection setCollection= new SetCollection();
		setCollection.addData();
		setCollection.showData();
		
		MapCollection mapCollection= new MapCollection();
		mapCollection.addData();
		mapCollection.showData();
	}

}
