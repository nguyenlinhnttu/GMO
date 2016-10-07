package collection;

import java.util.*;

public class ListCollection {
    List<Integer> colectionList = new ArrayList<>();

    // add item
    public void addData() {
        colectionList.add(1);
        colectionList.add(2);
        colectionList.add(3);
        colectionList.add(4);
        colectionList.add(5);
        colectionList.add(6);
    }

    // Show data
    public void showData() {
        System.out.println("Các phần tử của ArrayList là:");
        System.out.println("\t" + colectionList);
    }
}
