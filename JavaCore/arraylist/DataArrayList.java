package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class DataArrayList {
    static ArrayList<String> arrayList = new ArrayList<>();

    public void addItem() {
        arrayList.add("Phần tử thứ 1!");
        arrayList.add("Phần tử thứ 2!");
        arrayList.add("Phần tử thứ 3!");
        arrayList.add("Phần tử thứ 4!");
        arrayList.add("Phần tử thứ 5!");
    }

    // Show all item in arrayList
    public void showItemInArrayList() {
        System.out.println("- Các phần tử trong Array List: " + arrayList);
    }

    // Show size off arrayList
    public void sizeArrayList() {
        int size = arrayList.size();
        System.out.println("- Số phần tử của list: " + size);
    }

    // Check list Empty
    public void checkEmpty() {
        boolean checkEmpty = arrayList.isEmpty();
        if (checkEmpty == false) {
            System.out.println("- List có phần tử!");
        } else {
            System.out.println("- List Empty!");
        }
    }

    // get item with positon
    public void getItemInList() {
        String item = arrayList.get(2);
        System.out.println("- Item ở vị trí số 2 là: " + item);
    }

    // replace item with postiton, values
    public void replaceItemInList() {
        arrayList.set(2, "ReplaceItem số 3");
        System.out.println("- List sau khi đã Raplace: " + arrayList);
    }

    // Check value exists
    public void containsItems(String giaTri) {
        boolean check = arrayList.contains(giaTri);
        if (check == true) {
            System.out.println(giaTri + " đã tồn tại trong list!");
        } else {
            System.out.println(giaTri + " không tồn tại trong list!");
        }
    }

    // Clone ArrayList
    public void cloneList() {
        Object cloneList = arrayList.clone();
        System.out.println("- List được clone: " + cloneList);
    }

    // Delete item with position
    public void removeItem(int pos) {
        arrayList.remove(pos);
        System.out.println("- List sau khi xóa : " + arrayList);
    }

    // ListIterator
    public void listIterator() {
        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
