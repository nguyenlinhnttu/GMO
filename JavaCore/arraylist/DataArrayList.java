package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public  class DataArrayList {
	static ArrayList<String> arrayList= new ArrayList<>();
	
	// Thêm dữ liệu vào list
	public  void addItem() {
		arrayList.add("Phần tử thứ 1!");
		arrayList.add("Phần tử thứ 2!");
		arrayList.add("Phần tử thứ 3!");
		arrayList.add("Phần tử thứ 4!");
		arrayList.add("Phần tử thứ 5!");
	}
	
	// Hiển thị các phần tử trong ArrayList
	public  void showItemInArrayList() {
		System.out.println("- Các phần tử trong Array List: "+ arrayList);
	}
	
	// Hiển thị số lượng phần tử cúa list
	public  void sizeArrayList(){
		int size= arrayList.size();
		System.out.println("- Số phần tử của list: "+ size);
	}
	
	// Kiểm tra list có rỗng hay không
	public  void checkEmpty(){
		boolean  checkEmpty= arrayList.isEmpty();
		if(checkEmpty==false){
			System.out.println("- List có phần tử!");
		}else {
			System.out.println("- List Empty!");
		}		
	}
	
	// Hiện thị item trong list theo vị trí
	public  void getItemInList(){
		String item = arrayList.get(2);
		System.out.println("- Item ở vị trí số 2 là: " + item);
	}
	
	// Hiện thị item trong list theo vị trí
	public  void replaceItemInList(){
		arrayList.set(2, "ReplaceItem số 3");
		System.out.println("- List sau khi đã Raplace: " + arrayList);

	}
	
	// Kiểm tra giá trị
	public  void containsItems(String giaTri) {
		boolean check= arrayList.contains(giaTri);
		if (check==true) {
			System.out.println(giaTri + " đã tồn tại trong list! ");
		} else {
			System.out.println(giaTri + " không tồn tại trong list! ");
		}
	}

	// Clone ArrayList
	public  void cloneList() {
		Object cloneList=  arrayList.clone(); 
		System.out.println("- List được clone: " +cloneList);
	}

	//Xóa một phần tử trong list
	public void removeItem(int pos) {
		arrayList.remove(pos);
		System.out.println("- List sau khi xóa : " +arrayList);
	}		
	
	//ListIterator
	public void listIterator() {
	    ListIterator<String> iterator= arrayList.listIterator();
	    while (iterator.hasNext()) {
            System.out.print(iterator.next());
            
        }
	}
}
