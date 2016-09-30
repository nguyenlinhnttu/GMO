package hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHashTable dataHashTable= new DataHashTable();
		dataHashTable.addItem();
		dataHashTable.showHashTable();
		dataHashTable.addValueWithKey(5, "ABC");
		dataHashTable.getValueWithKey(2);
		dataHashTable.cloneMap();
		dataHashTable.deleteMap();
	}

}
