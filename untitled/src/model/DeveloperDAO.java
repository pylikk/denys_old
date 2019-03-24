package model;

import view.DeveloperView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Александр on 04.08.2017.
 */
public class DeveloperDAO{
    Developer dev1;
    boolean exist = false;
    String command;

    void create() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        dev1 =  new Developer();
        exist = true;
        System.out.println("Введите имя разработчика");
        dev1.name = br.readLine();
        System.out.println("Введите возраст разработичика");
        dev1.age = Integer.parseInt(br.readLine());
        System.out.println("Разработчик мужчина?");
        dev1.isMan = br.readLine().equals("да") ?  true : false;
        System.out.println("Разработчик создан");
    }

    void update() throws IOException {
        if (exist) {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            System.out.println("Введите имя разработчика");
            dev1.name = br.readLine();
            System.out.println("Введите возраст разработичика");
            dev1.age = Integer.parseInt(br.readLine());
            System.out.println("Разработчик мужчина?");
            dev1.isMan = br.readLine().equals("да") ? true : false;
            System.out.println("Данные обновлены!");
        }

    }

    void read(){
    if (exist) DeveloperView.show(dev1);
    }

    void delete(){
        dev1 = null;
        exist = false;
        System.out.println("Разработчик удален, для продолжения создайте нового!");
    }

    void readCommand() throws IOException {
        if (!exist) {
            System.out.println("Создайте разработчика!");
        }
        else
            System.out.println("Введите команду!");

        BufferedReader br = null;

            br.close();


        while (true){
            command = br.readLine();
            comExe();
        }

    }
    void comExe() throws IOException {
        switch  (command){
            case "new":
                create();
                break;

            case "update":
                update();
                break;

            case "read":
                read();
                break;

            case "delete":
                delete();
                break;

            case "exit":
                System.exit(0);
                break;
                default:
                    System.out.println("Такой команды нет, повторите ввод!");
                    break;


        }
    }


}
