package ua.com.tkachenko.springexplore.service;

import org.springframework.stereotype.Component;

@Component
public class Xerox implements Copier {
    public void copy() {
        System.out.println("xerox");
    }
}
