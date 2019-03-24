package ua.com.tkachenko.englishtrainer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.tkachenko.englishtrainer.dao.VerbDao;
import ua.com.tkachenko.englishtrainer.model.Verb;

import java.util.List;

@Service
public class VerbService {

    @Autowired
    private VerbDao verbDao;

    public String getSentence() {

        Verb verb = getRandomVerb();
        int type = (int) (1 + (Math.random() * 54));

        switch (type) {

            case 1: return "я " + verb.getVerbFuture().getVerbWithI() + " ?";
            case 2: return "ты " + verb.getVerbFuture().getVerbWithYou() + " ?";
            case 3: return "мы " + verb.getVerbFuture().getVerbWithWe() + " ?";
            case 4: return "они " + verb.getVerbFuture().getVerbWithThey() + " ?";
            case 5: return "он " + verb.getVerbFuture().getVerbWithHe() + " ?";
            case 6: return "она " + verb.getVerbFuture().getVerbWithShe() + " ?";

            case 7: return "я " + verb.getVerbFuture().getVerbWithI();
            case 8: return "ты " + verb.getVerbFuture().getVerbWithYou();
            case 9: return "мы " + verb.getVerbFuture().getVerbWithWe();
            case 10: return "они " + verb.getVerbFuture().getVerbWithThey();
            case 11: return "он " + verb.getVerbFuture().getVerbWithHe();
            case 12: return "она " + verb.getVerbFuture().getVerbWithShe();

            case 13: return "я " + "не " + verb.getVerbFuture().getVerbWithI();
            case 14: return "ты " + "не " + verb.getVerbFuture().getVerbWithYou();
            case 15: return "мы " + "не " + verb.getVerbFuture().getVerbWithWe();
            case 16: return "они " + "не " + verb.getVerbFuture().getVerbWithThey();
            case 17: return "он " + "не " + verb.getVerbFuture().getVerbWithHe();
            case 18: return "она " + "не " + verb.getVerbFuture().getVerbWithShe();


            case 19: return "я " + verb.getVerbNow().getVerbWithI() + " ?";
            case 20: return "ты " + verb.getVerbNow().getVerbWithYou() + " ?";
            case 21: return "мы " + verb.getVerbNow().getVerbWithWe() + " ?";
            case 22: return "они " + verb.getVerbNow().getVerbWithThey() + " ?";
            case 23: return "он " + verb.getVerbNow().getVerbWithHe() + " ?";
            case 24: return "она " + verb.getVerbNow().getVerbWithShe() + " ?";

            case 25: return "я " + verb.getVerbNow().getVerbWithI();
            case 26: return "ты " + verb.getVerbNow().getVerbWithYou();
            case 27: return "мы " + verb.getVerbNow().getVerbWithWe();
            case 28: return "они " + verb.getVerbNow().getVerbWithThey();
            case 29: return "он " + verb.getVerbNow().getVerbWithHe();
            case 30: return "она " + verb.getVerbNow().getVerbWithShe();

            case 31: return "я " + "не " + verb.getVerbNow().getVerbWithI();
            case 32: return "ты " + "не " + verb.getVerbNow().getVerbWithYou();
            case 33: return "мы " + "не " + verb.getVerbNow().getVerbWithWe();
            case 34: return "они " + "не " + verb.getVerbNow().getVerbWithThey();
            case 35: return "он " + "не " + verb.getVerbNow().getVerbWithHe();
            case 36: return "она " + "не " + verb.getVerbNow().getVerbWithShe();


            case 37: return "я " + verb.getVerbPast().getVerbWithI() + " ?";
            case 38: return "ты " + verb.getVerbPast().getVerbWithYou() + " ?";
            case 39: return "мы " + verb.getVerbPast().getVerbWithWe() + " ?";
            case 40: return "они " + verb.getVerbPast().getVerbWithThey() + " ?";
            case 41: return "он " + verb.getVerbPast().getVerbWithHe() + " ?";
            case 42: return "она " + verb.getVerbPast().getVerbWithShe() + " ?";

            case 43: return "я " + verb.getVerbPast().getVerbWithI();
            case 44: return "ты " + verb.getVerbPast().getVerbWithYou();
            case 45: return "мы " + verb.getVerbPast().getVerbWithWe();
            case 46: return "они " + verb.getVerbPast().getVerbWithThey();
            case 47: return "он " + verb.getVerbPast().getVerbWithHe();
            case 48: return "она " + verb.getVerbPast().getVerbWithShe();

            case 49: return "я " + "не " + verb.getVerbPast().getVerbWithI();
            case 50: return "ты " + "не " + verb.getVerbPast().getVerbWithYou();
            case 51: return "мы " + "не " + verb.getVerbPast().getVerbWithWe();
            case 52: return "они " + "не " + verb.getVerbPast().getVerbWithThey();
            case 53: return "он " + "не " + verb.getVerbPast().getVerbWithHe();
            case 54: return "она " + "не " + verb.getVerbPast().getVerbWithShe();

        }

        return "";
    }

    private Verb getRandomVerb () {
        int random = (int) (1 + (Math.random() * ((List<Verb>)verbDao.findAll()).size()));
        return verbDao.findOne(random);
    }



}
