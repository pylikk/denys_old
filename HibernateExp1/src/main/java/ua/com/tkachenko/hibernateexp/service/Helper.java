package ua.com.tkachenko.hibernateexp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ua.com.tkachenko.hibernateexp.model.Tank;
import ua.com.tkachenko.hibernateexp.repository.TankRepository;

@Service
public class Helper {

    private TankRepository tankRepository;

    public Helper(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    @Transactional
    public void updateTank() {
        Tank tank = tankRepository.findById(1).get();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tank.setName("updated");
        tankRepository.save(tank);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW)
    public void updateTankException() {
        Tank tank = tankRepository.findById(1).get();
        tank.setFuel(200);

        tankRepository.save(tank);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        if (true)
//            throw new RuntimeException();
    }
}
