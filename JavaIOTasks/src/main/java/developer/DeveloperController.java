package developer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ьф on 15.07.2017.
 */
public class DeveloperController {

    private DeveloperDAO developerDAO;

    public int getDevCount () {
        return developerDAO.getDevCount();
    }



    public void showDevelopers () {
        int devCount = getDevCount();
        if (devCount == 0) {
            System.out.println("Список девелоперов пуст. Для добавления нового девелопера " +
                    "введите слово \"new\" и нажмите Enter");
        }
        else {
            System.out.println("Текущий список девелоперов: ");
            developerDAO.showAllDevelopers();
        }

    }



}
