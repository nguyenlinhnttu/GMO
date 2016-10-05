package linkedlist;

public class Main {
	public static void main(String[] args) {
	
	DataLinked dataLinked= new DataLinked();
	//Gọi các method đã tạo
	dataLinked.addItem();
	dataLinked.showList();
	dataLinked.addFirstItem("FistName");       //Thêm vào vị trí đầu tiên
	dataLinked.addItemWithPosition(2,"Nam");   //Add item ở vị trí số 2
	dataLinked.changeItemWithPos(3,"Việt");    //Thay đổi Item ở vị trí số 3
	System.out.println("LinkedList sau khi thay đổi là:");
	dataLinked.showList();
	dataLinked.listIterator();                 //Duyệt sử dụng Iterator
	}
}
