package ua.com.tkachenko;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.tkachenko.model.Skill;
import ua.com.tkachenko.model.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    User user1 = new User(1, "user1");
    User user2 = new User(2, "user2");

    Skill skill1 = new Skill(1, "skill1");
    Skill skill2 = new Skill(2, "skill2");

    List<User> users1 = new ArrayList<User>();
    List<Skill> skills = new ArrayList<Skill>();



    @PostConstruct
    void init () {
        users1.add(user1);
        users1.add(user2);

        skills.add(skill1);
        skills.add(skill2);

//        user1.setSkills(skills);
//        user2.setSkills(skills);

        skill1.setUsers(users1);
        skill2.setUsers(users1);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User user () {
        return user1;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> addUser (@RequestBody User user) {

        System.out.println(user.getId() + user.getName());

        return new ResponseEntity<User>(user, HttpStatus.CREATED);

    }

    @RequestMapping("/skill")
    public Skill skill () {
        return skill1;
    }

}
