package collection;

import java.util.*;

public class MapCollection {
    Map<Integer, String> colectionMap = new HashMap<>();

    // Add item
    public void addData() {
        colectionMap.put(1, "A");
        colectionMap.put(2, "C");
        colectionMap.put(3, "E");
        colectionMap.put(4, "G");
        colectionMap.put(5, "B");
    }

    // Show item with key and value
    public void showData() {
        System.out.println("Các phần tử của HashMap là:");
        Set<Map.Entry<Integer, String>> set = colectionMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}