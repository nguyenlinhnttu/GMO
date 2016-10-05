package resourceExample;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle	resourceBundle= ResourceBundle.getBundle("MessageBundle",Locale.US);
		System.out.println(resourceBundle.getString("greeting"));
		
		Locale locale=new Locale("vi", "VN");
		ResourceBundle   resourceBundle2= ResourceBundle.getBundle("MessageBundle",locale);
        System.out.println(resourceBundle2.getString("greeting"));
	}

}
