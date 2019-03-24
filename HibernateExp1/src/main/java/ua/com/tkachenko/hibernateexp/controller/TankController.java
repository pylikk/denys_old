package ua.com.tkachenko.hibernateexp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.tkachenko.hibernateexp.service.TankServiceImpl;

@RestController
public class TankController {

    private TankServiceImpl tankService;

    public TankController(TankServiceImpl tankService) {
        this.tankService = tankService;
    }

    @GetMapping("/demo")
    public String demoLostUpdate() {
        tankService.demo();
        return "OK";
    }

}
