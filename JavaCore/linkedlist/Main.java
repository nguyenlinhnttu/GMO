﻿package linkedlist;

public class Main {
	public static void main(String[] args) {
	
	DataLinked dataLinked= new DataLinked();
	//Gọi các method đã tạo
	dataLinked.addItem();
	dataLinked.showList();
	dataLinked.addFirstItem("FistName");
	dataLinked.addItemWithPosition(2,"Nam");
	dataLinked.changeItemWithPos(3,"Việt");
	System.out.println("LinkedList sau khi thay đổi là:");
	dataLinked.showList();
	}
}
