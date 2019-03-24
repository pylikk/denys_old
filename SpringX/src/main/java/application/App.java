package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
        Cat vaska = context.getBean("Cat",application.Cat.class);
        context.registerShutdownHook();


    }
}
