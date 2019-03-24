package ua.com.tkachenko.hibernateexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"ua.com.tkachenko.hibernateexp.repository"})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);


    }


}
