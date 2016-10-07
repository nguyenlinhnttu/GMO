package hashtable;

public class Main {

	public static void main(String[] args) {
		DataHashTable dataHashTable= new DataHashTable();
		//Call method
		dataHashTable.addItem();
		dataHashTable.showHashTable();
		dataHashTable.addValueWithKey(5, "ABC");  
		dataHashTable.getValueWithKey(2);
		dataHashTable.cloneMap(); 
		dataHashTable.containsKey(1);
		dataHashTable.deleteMap();
	}
}
