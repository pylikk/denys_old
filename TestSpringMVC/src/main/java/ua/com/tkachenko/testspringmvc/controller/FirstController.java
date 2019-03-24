package ua.com.tkachenko.testspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {

    @RequestMapping(value = "/man")
    public String check () {
        return "first";
    }

    @RequestMapping(value = "/")
    public String ch () {
        return "second";
    }
}
