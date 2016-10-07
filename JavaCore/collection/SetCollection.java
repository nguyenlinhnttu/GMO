package collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    Set<String> listSet = new HashSet<>();

    // Add data listSet
    public void addData() {
        listSet.add("A");
        listSet.add("C");
        listSet.add("E");
        listSet.add("G");
        listSet.add("B");
    }

    // Show data
    public void showData() {
        System.out.println("Các phần tử của HashSet là:");
        System.out.println("\t" + listSet);
    }
}
