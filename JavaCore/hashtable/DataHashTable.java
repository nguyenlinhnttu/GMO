package hashtable;
import java.util.*;
public class DataHashTable {
	 Hashtable<Integer,String> animalHash = new Hashtable<>();
	 // add Data
	 public void addItem() {
	     animalHash.put(1, "Con chim");
	     animalHash.put(2, "Con Cá");
	     animalHash.put(3, "Con Cò");
	     animalHash.put(4, "Con Mèo");
	     animalHash.put(5, "Con Chó");
	}

	// show data
	 public void showHashTable() {
		 Enumeration<Integer> enumeration = animalHash.keys();
		 while (enumeration.hasMoreElements()) {
			Integer key = (Integer) enumeration.nextElement();
			String value = animalHash.get(key);
			System.out.println(key + " : " + value );
		}
	}

	 // Add data with key and value
	 public void addValueWithKey(int key, String value) {
	     animalHash.put(key, value);
		 System.out.println("Dữ liệu mới sau khi add là: ");
		 showHashTable();
	}
	 
	 //get value with key
	 public void getValueWithKey(int key) {
		String value = animalHash.get(key);
		System.out.println("Gía trị tại key : " + key + " là " + value);
	}

	 //Clone map
	 public void cloneMap() {
		 Object object= animalHash.clone();
		 System.out.println("Map clone có dữ liệu là: "+ object);
	}
	 
	 //check key exits
	 public void containsKey(int key) {
        boolean isContain = animalHash.containsKey(key);
        if(isContain == true){
            System.out.println("Tồn tại");
        } else {
            System.out.println("Ko Tồn tại");
        }
    }
	 
	 //clear map
	 public void deleteMap() {
	    animalHash.clear();
		System.out.println("Xóa dữ liệu trong Map ");
		showHashTable();
	}	
}
