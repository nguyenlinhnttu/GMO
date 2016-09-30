package properties;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertiesModel propertiesModel= new PropertiesModel();
		propertiesModel.addItems();
		propertiesModel.showAllKeyValue();
		propertiesModel.getValueWithKey("B");
	}

}
