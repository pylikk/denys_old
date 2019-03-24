package ua.com.tkachenko.englishtrainer.model;

import javax.persistence.*;

@Entity
public class VerbFuture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Verb verb;

    @Column(name = "я")
    private String verbWithI;

    @Column(name = "ты")
    private String verbWithYou;

    @Column(name = "мы")
    private String verbWithWe;

    @Column(name = "они")
    private String verbWithThey;

    @Column(name = "он")
    private String verbWithHe;

    @Column(name = "она")
    private String verbWithShe;

    public VerbFuture() {
    }

    public Verb getVerb() {
        return verb;
    }

    public void setVerb(Verb verb) {
        this.verb = verb;
    }

    public String getVerbWithI() {
        return verbWithI;
    }

    public void setVerbWithI(String verbWithI) {
        this.verbWithI = verbWithI;
    }

    public String getVerbWithYou() {
        return verbWithYou;
    }

    public void setVerbWithYou(String verbWithYou) {
        this.verbWithYou = verbWithYou;
    }

    public String getVerbWithWe() {
        return verbWithWe;
    }

    public void setVerbWithWe(String verbWithWe) {
        this.verbWithWe = verbWithWe;
    }

    public String getVerbWithThey() {
        return verbWithThey;
    }

    public void setVerbWithThey(String verbWithThey) {
        this.verbWithThey = verbWithThey;
    }

    public String getVerbWithHe() {
        return verbWithHe;
    }

    public void setVerbWithHe(String verbWithHe) {
        this.verbWithHe = verbWithHe;
    }

    public String getVerbWithShe() {
        return verbWithShe;
    }

    public void setVerbWithShe(String verbWithShe) {
        this.verbWithShe = verbWithShe;
    }
}
