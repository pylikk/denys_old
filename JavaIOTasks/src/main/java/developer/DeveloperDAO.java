package developer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ьф on 15.07.2017.
 */
public class DeveloperDAO {

    Developer developer;
    private Map<Integer, Developer> map = new HashMap<>();

    public void addDeveloper(Developer developer) {
        map.put(developer.getId(),developer);
    }

    public int getDevCount () {
        return developer.getCount();
    }

    public void showAllDevelopers() {

    }

}
