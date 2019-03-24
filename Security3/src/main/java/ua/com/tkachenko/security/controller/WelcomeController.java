package ua.com.tkachenko.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping(value = {"/","/welcome"})
    public String welcome () {
        return "welcome";
    }

    @RequestMapping(value = "/admin")
    public String admin () {
        return "admin";
    }

    @RequestMapping(value = "/registration")
    public String registration () {
        return "registration";
    }
}


