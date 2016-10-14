package injectinginner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingInnerMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanInject.xml");
        SimpleMovieLister lister = (SimpleMovieLister) context.getBean("simpleMovie");
        lister.getMovie();
    }
}
