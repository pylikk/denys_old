package ua.com.tkachenko.springexplore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.tkachenko.springexplore.service.Copier;

public class App {



    public static void main(String[] args) {

        Dop dop = new Dop();

        ApplicationContext context = new AnnotationConfigApplicationContext();


        dop.gg();

    }

}
