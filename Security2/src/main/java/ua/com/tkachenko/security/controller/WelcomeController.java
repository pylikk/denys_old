package ua.com.tkachenko.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/")
    public String welcome () {
        return "index";
    }

    @RequestMapping(value = "/admin")
    public String admin () {
        return "admin";
    }
}
