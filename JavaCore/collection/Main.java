package collection;

public class Main {

	public static void main(String[] args) {
		
		//ListCollection 
		ListCollection listCollection= new ListCollection();
		listCollection.addData();
		listCollection.showData();
		
		//SetCollection 
		SetCollection setCollection= new SetCollection();
		setCollection.addData();
		setCollection.showData();
		
		//MapCollection
		MapCollection mapCollection= new MapCollection();
		mapCollection.addData();
		mapCollection.showData();
	}
}
