package arraylist;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	DataArrayList data= new DataArrayList();
	data.addItem();            //Thêm phần tử vào List
	data.sizeArrayList();      //Size List
	data.checkEmpty();         //Kiểm tra List có rỗng hay không
	data.showItemInArrayList();           // Hiển thị Item trong List
	data.getItemInList();                 //get Item tại vị trí nhập vào
	data.replaceItemInList();             //replace một item trong List
	data.containsItems("Phần tử thứ 0!"); //Kiểm tra object có tồn tại hay không
	data.cloneList();      //Clone một List
	data.removeItem(1);    //Xóa phần tử đầu tiên
	data.listIterator();   //Sử dụng ListIterator để duyệt

	}
}
