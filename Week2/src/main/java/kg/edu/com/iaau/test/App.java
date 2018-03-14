package kg.edu.com.iaau.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //Person person = new Person();
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("/kg/edu/iaau/com/test/beans/beans.xml");
        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);

        //Person person2 = (Person) context.getBean("person");
        //person1.setTaxId(666);

        //System.out.println(person2);
        //System.out.println(person1);

        //person.speak();

        //Address address = (Address)context.getBean("address");
        //System.out.println(address);
    }
}
