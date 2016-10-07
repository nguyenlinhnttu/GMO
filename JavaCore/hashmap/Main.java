package hashmap;

public class Main {

	public static void main(String[] args) {
	    //New DataHashMap
		DataHashMap dataHashMap= new DataHashMap();
		//Call method
		dataHashMap.addItems();
		dataHashMap.showMapItem();
		dataHashMap.getValue(2);
		dataHashMap.checkValue("Nguyễn Văn Linh");
		dataHashMap.getHashCode();
		dataHashMap.getAllKey();
		dataHashMap.getLenghtHash();
	}
}
