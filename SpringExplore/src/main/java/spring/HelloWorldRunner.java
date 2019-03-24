package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("springHelloWorld");
        helloWorld.getHelloMessage();
    }

}
