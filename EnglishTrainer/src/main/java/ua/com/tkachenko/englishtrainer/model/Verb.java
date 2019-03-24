package ua.com.tkachenko.englishtrainer.model;

import javax.persistence.*;

@Entity
public class Verb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Глагол")
    private String name;

    @OneToOne(mappedBy = "verb")
    private VerbFuture verbFuture;

    @OneToOne(mappedBy = "verb")
    private VerbNow verbNow;

    @OneToOne(mappedBy = "verb")
    private VerbPast verbPast;


    public Verb() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VerbFuture getVerbFuture() {
        return verbFuture;
    }

    public void setVerbFuture(VerbFuture verbFuture) {
        this.verbFuture = verbFuture;
    }

    public VerbNow getVerbNow() {
        return verbNow;
    }

    public void setVerbNow(VerbNow verbNow) {
        this.verbNow = verbNow;
    }

    public VerbPast getVerbPast() {
        return verbPast;
    }

    public void setVerbPast(VerbPast verbPast) {
        this.verbPast = verbPast;
    }
}
