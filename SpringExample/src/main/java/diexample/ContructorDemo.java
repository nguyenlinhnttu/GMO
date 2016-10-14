package diexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContructorDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        SimpleMovieLister lister = (SimpleMovieLister) context.getBean("simpleMovie");
        lister.getMovie();
    }
}