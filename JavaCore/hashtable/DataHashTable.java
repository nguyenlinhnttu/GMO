package hashtable;
import java.util.*;
public class DataHashTable {
	 Hashtable<Integer,String> hashtable = new Hashtable<>();
	 // Thêm dữ liệu vào map
	 public void addItem() {
		 hashtable.put(1, "Con chim");
		 hashtable.put(2, "Con Cá");
		 hashtable.put(3, "Con Cò");
		 hashtable.put(4, "Con Mèo");
		 hashtable.put(5, "Con Chó");
	}

	// Hiển thị dữ liệu
	 public void showHashTable() {
		 Enumeration<Integer> enumeration= hashtable.keys();
		 while (enumeration.hasMoreElements()) {
			Integer key = (Integer) enumeration.nextElement();
			String value= hashtable.get(key);
			System.out.println(key +" : " + value );
		}
	}

	 // Add dữ liệu theo key
	 public void addValueWithKey(int key, String value) {
		 hashtable.put(key, value);
		 System.out.println("Dữ liệu mới sau khi add là: ");
		 showHashTable();
	}
	 
	 //get value with key
	 public void getValueWithKey(int key) {
		String value= hashtable.get(key);
		System.out.println("Gía trị tại key : " +key +" là " +value);
	}

	 //Clone map
	 public void  cloneMap() {
		 Object object= hashtable.clone();
		 System.out.println("Map clone có dữ liệu là: "+ object);
		
	}
	 
	 //Kiểm tra key có tồn tại trong hashtable hay không
	 public void containsKey(int key) {
        boolean isContain = hashtable.containsKey(key);
        if(isContain==true){
            System.out.println("Tồn tại");
        } else {
            System.out.println("Ko Tồn tại");
        }
    }
	 
	 //Xóa dữ liệu trong map
	 public void deleteMap() {
		hashtable.clear();
		System.out.println("Xóa dữ liệu trong Map ");
		showHashTable();
	}	
}
