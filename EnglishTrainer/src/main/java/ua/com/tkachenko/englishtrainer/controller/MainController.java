package ua.com.tkachenko.englishtrainer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.tkachenko.englishtrainer.service.VerbService;

@RestController
public class MainController {

    @Autowired
    private VerbService verbService;

    @RequestMapping("/")
    public String getSetnence () {
        return verbService.getSentence();
    }
}
