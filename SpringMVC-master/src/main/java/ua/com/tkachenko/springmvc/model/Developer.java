package ua.com.tkachenko.springmvc.model;

import java.util.List;

public class Developer {

    private int id;
    private String name;
    private List<Skill> skills;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
