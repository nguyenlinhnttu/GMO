package hashmap;
import java.util.*;
public class DataHashMap {
	 HashMap<Integer, String> hashMap = new HashMap<>();
	 // Thêm dữ liệu vào hashmap
	 public void addItems() {
		 hashMap.put(1, "Nguyễn Văn Linh");
		 hashMap.put(2, "Dư Ngọc Kim");
		 hashMap.put(3, "Đặng Tường Minh");
	}
	 
	 // Xuất dữ liệu key và value
	 public void showMapItem() {
		Set set = hashMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
	         Map.Entry me = (Map.Entry)iterator.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}
	 
	 // lấy value theo key
	 public void getValue(int key) {
		 String value= hashMap.get(key);
		 System.out.println("Tại vị trí thứ "+ key+ " có giá trị là: " +value);	
	}
	   
	 //Xóa một phần tử với key
	  public void removeItem(int key) {
	      hashMap.remove(key);
	      System.out.println("Xóa thành công!");
	 } 
	  
	// Kiểm tra value có tồn tại hay không
	public void checkValue(String value) {
		boolean checkValue= hashMap.containsValue(value);
		if (checkValue==true) {
			System.out.println(value + " Tồn tại");
		} else {
			System.out.println(value + " Không Tồn tại");
		}			
	}
	
	//get hashcode
	public void getHashCode() {
		int code= hashMap.hashCode();
		System.out.println("HashCode của Map là: "+ code);
	}
	
	//Lấy độ dài của HashMap
	public void getLenghtHash() {
        int lenght= hashMap.size();
        System.out.println("Độ dài của HashMap này là: "+lenght);
    }
	
	//Lấy toàn bộ key của HashMAP
	public void getAllKey() {
        Set set= hashMap.keySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
	
}
