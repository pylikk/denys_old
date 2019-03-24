package ua.com.tkachenko.testthreads.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello () {
        return "welcome";
    }

    @RequestMapping("/first")
    public String first () {
        System.out.println("first before: ");
        System.out.println(new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("first after: ");
        System.out.println(new Date());
        return "first";
    }

    @RequestMapping("/second")
    public String second () {
        System.out.println("second: ");
        System.out.println(new Date());
        return "second";
    }
}
