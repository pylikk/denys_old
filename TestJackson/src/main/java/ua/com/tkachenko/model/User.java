package ua.com.tkachenko.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ua.com.tkachenko.rest.CustomUserDeserializer;
import ua.com.tkachenko.rest.CustomUserSerializer;

import java.util.List;

@JsonDeserialize(using = CustomUserDeserializer.class)
@JsonSerialize(using = CustomUserSerializer.class)
public class User {

    private Integer id;
    private String name;


//    private List<Skill> skills;

    public User() {
    }

    public User(int id, String name) {
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

//    public List<Skill> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<Skill> skills) {
//        this.skills = skills;
//    }
}
