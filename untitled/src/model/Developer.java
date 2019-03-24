package model;

/**
 * Created by Александр on 04.08.2017.
 */
public class Developer {
    int age;
    String name;
    boolean isMan;

   public Developer(){
        this.age = 18;
        this.name = "Chel";
        this.isMan = true;
    }

   public Developer(int age, String name, boolean man){
        this.age = age;
        this.name = name;
        this.isMan = man;
    }

   public int getAge(){
        return this.age;
    }
   public void setAge(int age){
        this.age = age;
    }

   public String getName(){
        return this.name;
    }
   public void setName(String name){
        this.name = name;
    }

   public boolean getIsMan(){
        return isMan;
    }
   public void setIsMan(boolean man){
        this.isMan = man;
    }
}
