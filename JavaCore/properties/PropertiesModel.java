package properties;
import java.util.*;
public class PropertiesModel {
	Properties properties = new Properties();
	Set states;
	//Thêm dữ liệu vào properties 
	public void addItems() {
		properties.put("A","Nguyễn Văn Linh");
		properties.put("B","Dư Ngọc Kim");
		properties.put("C","Đặng Tường Minh");
		properties.put("D","Lý Trường Khải");
	}

	//Sử dụng Iterator duyệt và hiển thị key và các value
	public void showAllKeyValue() {
		states = properties.keySet();
		Iterator itr = states.iterator();
	      while(itr.hasNext()) {
	        String key  = (String) itr.next();
		String value= properties.getProperty(key);
	        System.out.println("Key " +
	        		 key + " value " + value+ ".");
	      }
	}

	//Nhập key get value
	public void getValueWithKey(String key) {
		String value =properties.getProperty(key);
		System.out.println("Value của "+ key +" là: "+value );
	}
}
