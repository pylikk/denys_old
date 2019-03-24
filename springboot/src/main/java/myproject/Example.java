package myproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    public static String message = "default";

    @RequestMapping("/")
    String home() {
        return message;
    }



}