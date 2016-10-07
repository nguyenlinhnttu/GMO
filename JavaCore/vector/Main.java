package vector;

public class Main {

	public static void main(String[] args) {
		DataVector dataVector = new DataVector();
		//Call method
		dataVector.addItems();
		dataVector.getFirstItem();
		dataVector.getLastItem();
		dataVector.removeItem("Giá trị 1");
		dataVector.converToString();
		dataVector.deteteAllIteam();
	}
}
