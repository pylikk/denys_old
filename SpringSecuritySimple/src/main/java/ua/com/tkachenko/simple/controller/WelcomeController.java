package ua.com.tkachenko.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.tkachenko.simple.dao.DeveloperDao;
import ua.com.tkachenko.simple.dao.SkillDao;
import ua.com.tkachenko.simple.model.Developer;
import ua.com.tkachenko.simple.model.Skill;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private SkillDao skillDao;

    @Autowired
    private DeveloperDao developerDao;

    @RequestMapping(value = "/")
    public String welcome () {
        return "welcome";
    }

    @RequestMapping(value = "/skills")
    public String skills (Model model) {
        model.addAttribute("allSkills",skillDao.findAll());
        model.addAttribute("skill", new Skill());
        return "skills";
    }

    @RequestMapping(value = "/skills/add", method = RequestMethod.POST)
    public String addSkill (@ModelAttribute(value = "skill") Skill skill) {
        skillDao.save(skill);
        return "redirect:/skills";
    }

    @RequestMapping(value = "/developers")
    public String developers (Model model) {
        model.addAttribute("allDevelopers", developerDao.findAll());
        model.addAttribute("allSkills",skillDao.findAll());
        model.addAttribute("developer", new Developer());
        return "developers";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Skill.class, "skill", new PropertyEditorSupport() {
//            @Override
//            public void setAsText(String text) {
//                Skill s = skillDao.findByName(text);
//                setValue(s);
//            }
//        });
//    }

    @RequestMapping(value = "/developers/add", method = RequestMethod.POST)
    public String addDeveloper (@RequestParam("skills") String[] skills, @ModelAttribute("developer") Developer developer) {

        List<Skill> devSkills = new ArrayList<>();
        for (String s : skills) {
            System.out.printf(s);
        }
//        developer.setSkills(devSkills);
//        developerDao.save(developer);

        return "redirect:/developers";
    }

}
