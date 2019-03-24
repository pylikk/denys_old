package ua.com.tkachenko.hibernateexp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ua.com.tkachenko.hibernateexp.repository.TankRepository;
import ua.com.tkachenko.hibernateexp.model.Tank;


@Service
public class TankServiceImpl{

    private TankRepository tankRepository;
    private Helper helper;

    public TankServiceImpl(TankRepository tankRepository, Helper helper) {
        this.tankRepository = tankRepository;
        this.helper = helper;
    }

    public void demo(){

        Tank tank = new Tank(1, "T-34", 100);
        tankRepository.save(tank);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread firstThread = new Thread(() -> helper.updateTank());

        Thread secondThread = new Thread(() -> helper.updateTankException());

        firstThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        secondThread.start();

    }
}
