package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Iuriy Gaydarzhi.
 * @since 19.08.2021
 */
public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Travolta.J@yahoo.uk", "Джон Джо́зеф Траволта");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
