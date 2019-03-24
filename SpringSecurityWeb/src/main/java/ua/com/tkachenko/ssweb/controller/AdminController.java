package ua.com.tkachenko.ssweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.tkachenko.ssweb.dao.UserDAO;
import ua.com.tkachenko.ssweb.model.User;

@Controller
public class AdminController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/admin")
    public String admin () {

        return "admin";
    }

    @RequestMapping(value = "/")
    public String welcome () {

        return "welcome";
    }


}
