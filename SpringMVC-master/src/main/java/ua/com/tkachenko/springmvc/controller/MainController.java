package ua.com.tkachenko.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.tkachenko.springmvc.model.Developer;
import ua.com.tkachenko.springmvc.model.Skill;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<Skill> allSkills() {
        List<Skill> allSkills = new ArrayList<Skill>();
        allSkills.add(new Skill("Java"));
        allSkills.add(new Skill("SQL"));
        allSkills.add(new Skill("Spring"));
        allSkills.add(new Skill("Hibernate"));

        return allSkills;
    }

    @RequestMapping(value = "/developers")
    public String developers(Model model) {
        model.addAttribute("allSkills", allSkills());
        model.addAttribute("developer", new Developer());
        return "developers";
    }

    @RequestMapping(value = "/developer/add")
    public String addDeveloper(@RequestParam("skills") String[] skills,
                               @ModelAttribute(name = "developer") Developer developer) {
        for (String s : skills) {
            System.out.println(s);
        }

        return "redirect:/developers";
    }
}
