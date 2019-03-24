package ua.com.tkachenko.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ua.com.tkachenko.rest.CustomSkillSerializer;

import java.util.List;

@JsonSerialize(using = CustomSkillSerializer.class)
public class Skill {

    private Integer id;
    private String name;


    private List<User> users;

    public Skill() {
    }

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
