package hashmap;
import java.util.*;
public class DataHashMap {
	 HashMap<Integer, String> hashMap = new HashMap<>();
	 // add data hashmap
	 public void addItems() {
		 hashMap.put(1, "Nguyễn Văn Linh");
		 hashMap.put(2, "Dư Ngọc Kim");
		 hashMap.put(3, "Đặng Tường Minh");
	}
	
	 // Show data key and value
	 public void showMapItem() {
		Set set = hashMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
	         Map.Entry me = (Map.Entry)iterator.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}
	 
	 // get value with key
	 public void getValue(int key) {
		 String value = hashMap.get(key);
		 System.out.println("Tại vị trí thứ " + key + " có giá trị là: " + value);	
	}
	   
	 //delete item with key
	  public void removeItem(int key) {
	      hashMap.remove(key);
	      System.out.println("Xóa thành công!");
	 } 
	  
	// check value  exits
	public void checkValue(String value) {
		boolean checkValue= hashMap.containsValue(value);
		if (checkValue == true) {
			System.out.println(value + " Tồn tại");
		} else {
			System.out.println(value + " Không Tồn tại");
		}			
	}
	
	//get hashcode
	public void getHashCode() {
		int code = hashMap.hashCode();
		System.out.println("HashCode của Map là: " + code);
	}
	
	//het lengh HashMap
	public void getLenghtHash() {
        int lenght = hashMap.size();
        System.out.println("Độ dài của HashMap này là: " + lenght);
    }
	
	//get all key HashMAP
	public void getAllKey() {
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
	
}
