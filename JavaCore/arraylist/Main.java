package arraylist;

public class Main {

    public static void main(String[] args) {
        // Call method
        DataArrayList data = new DataArrayList();

        data.addItem();
        data.sizeArrayList();
        data.checkEmpty();
        data.showItemInArrayList();
        data.getItemInList();
        data.replaceItemInList();
        data.containsItems("Phần tử thứ 0!");
        data.cloneList();
        data.removeItem(1);
        data.listIterator();
    }
}
