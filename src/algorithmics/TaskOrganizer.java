package algorithmics;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskOrganizer {

    public static void main(String[] args) {
        char [] chars = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println("Tasks Organizing: " + taskOrganizer(chars, n));
    }

    public static int taskOrganizer(char [] chars, int n) {

        //Iterate the char array and load a Map<Character, Integer>
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            charCounts.put(chars[i], charCounts.getOrDefault(chars[i], 0) + 1);
        }

        //The Map should have > 1 and <= 2.
        if (charCounts.size() != 2) {return -1;}

        //Create a PriorityQueue<Map<Character, Integer>> comparing by charCounts.value.
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(Comparator.comparing(Map.Entry::getValue));
        pq.addAll(charCounts.entrySet());

        /*for (int i = 0; i < n; i++) {
            char c = pq.peek().getKey();
            System.out.println("Key -> " + pq.peek().getKey() + "Value -> " + charCounts.get(pq.poll().getKey()));
        }*/

        //Create an int taskCounter.
        int taskCount = 0;
        int nCounter = 0;

        while (!pq.isEmpty()) {
            char c1 = pq.poll().getKey();
            char c2 = pq.poll().getKey();

            if (c1 != c2) {
                taskCount += 2;
                if(nCounter < n){
                    nCounter++;
                    taskCount++;
                }
            }

            charCounts.put(c1, charCounts.getOrDefault(c1, 0) - 1);
            charCounts.put(c2, charCounts.getOrDefault(c2, 0) - 1);

            if(charCounts.get(c1) > 0 || charCounts.get(c2) > 0){
                pq.addAll(charCounts.entrySet());
            }
        }
        return taskCount;
    }
}
