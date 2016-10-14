package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanAutowiring.xml");
        LaptopStore laptopStore = (LaptopStore) context.getBean("laptopStore");  

        System.out.println("Laptop1's : " + laptopStore.getLaptop1().showTradeMark());  
        System.out.println("Laptop2's : " + laptopStore.getLaptop2().showTradeMark());
    }
}
