package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = applicationContext.getBean(AtmUI.class);
        atmUI.run();
    }
}
