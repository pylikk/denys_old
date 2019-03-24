package ua.com.tkachenko.springexplore;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.tkachenko.springexplore.service.Copier;

public class Dop {

    @Autowired
    Copier copier;


    public void gg () {
        copier.copy();
    }
}
