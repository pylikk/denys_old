package developer;

/**
 * Created by Ьф on 15.07.2017.
 */
public class Developer {

    private String firstName;
    private String lastName;
    private String language;
    private int age;
    private boolean sex;
    private int id;
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Developer(String firstName, String lastName, String language, int age, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.age = age;
        this.sex = sex;
    }
}
