package dsa;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Alice", 30);
        dataMap.put("Bob", 25);
        dataMap.put("Charlie", 35);
        dataMap.put("David", 20);

        // Create a PriorityQueue to store Map.Entry objects
        // Prioritize by value (ascending order)
        PriorityQueue<Map.Entry<String, Integer>> pqByValue = new PriorityQueue<>(
                Comparator.comparing(Map.Entry::getValue)
        );

        // Add all entries from the HashMap to the PriorityQueue
        pqByValue.addAll(dataMap.entrySet());

        System.out.println("PriorityQueue ordered by value (ascending):");
        while (!pqByValue.isEmpty()) {
            System.out.println(pqByValue.poll());
        }

        System.out.println("\n---");

        // Create another PriorityQueue, this time prioritizing by key (descending order)
        PriorityQueue<Map.Entry<String, Integer>> pqByKeyDescending = new PriorityQueue<>(
                Comparator.comparing(Map.Entry::getKey, Comparator.reverseOrder())
        );

        pqByKeyDescending.addAll(dataMap.entrySet());

        System.out.println("PriorityQueue ordered by key (descending):");
        while (!pqByKeyDescending.isEmpty()) {
            System.out.println(pqByKeyDescending.poll());
        }
    }
}
