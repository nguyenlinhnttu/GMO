package hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHashTable dataHashTable= new DataHashTable();
		dataHashTable.addItem();
		dataHashTable.showHashTable();        //Hiển thị Hash
		dataHashTable.addValueWithKey(5, "ABC");  //Thêm giá trị với key và value
		dataHashTable.getValueWithKey(2);     //Lấy giá trị với key có sẵn
		dataHashTable.cloneMap();             //Clonemap
		dataHashTable.containsKey(1);         //Kiểm tra key có tồn tại hay không
		dataHashTable.deleteMap();            //Xóa toàn bộ map
		
		
	}
}
