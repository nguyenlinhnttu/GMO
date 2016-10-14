package injectingcolection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("BeansColec.xml");
         JavaColection javaColec = (JavaColection)context.getBean("javaCollection");

         javaColec.getAddressList();
         javaColec.getAddressSet();
         javaColec.getAddressMap();
         javaColec.getAddressProp();
    }
}
