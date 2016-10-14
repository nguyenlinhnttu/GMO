package beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {
    public static void main(String[] arge) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("beanLifeCycle");
        helloWorld.getMessageBean();
        context.registerShutdownHook(); //Detroy Bean
    }
}
