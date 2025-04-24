package DSA.In.Java;

import java.util.*;

public class DSA_HashTables {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.get("A"));

        // Using forEach with Map.Entry
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        /*
        1
        A: 1
        B: 2
        C: 3
        D: 4
        */

        // Alternative : for-each with Entry and entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Alternative : normal for-each loop
        Set<String> mapKeys = map.keySet(); // contains all keys of the map
        Collection<Integer> mapValues = map.values(); // contains all values of the map
        for (String key : mapKeys) {
            System.out.println("Key: " + key);
        }
        for (Integer value : mapValues) {
            System.out.println("Value: " + value);
        }
    }
}
