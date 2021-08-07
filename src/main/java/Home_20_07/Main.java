package Home_20_07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by .
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig_20_07.xml");
        Course first = context.getBean("first", Course.class);
        first.printStudents();

        Course second = context.getBean("second", Course.class);
        second.printStudents();
    }
}
