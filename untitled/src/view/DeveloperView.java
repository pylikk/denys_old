package view;

import model.Developer;

/**
 * Created by Александр on 04.08.2017.
 */
public class DeveloperView {
   public static void show(Developer dev){
        System.out.println("Имя разработчика: " + dev.getName());
        System.out.println("Возраст: " + dev.getAge());
        System.out.println("Пол: " + dev.getIsMan());
    }
}
