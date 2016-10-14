package iocexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("C:/Users/MyPC/workspace/SpringExample/src/main/resources/Beans.xml");
        
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }
}
