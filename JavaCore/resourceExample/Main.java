package resourceExample;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle	resourceBundle= ResourceBundle.getBundle("MessageBundle",Locale.US);
		System.out.println(resourceBundle.getString("greeting"));
	}

}