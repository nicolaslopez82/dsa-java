package algorithmics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 *
 *
 * Example 1:
 * Input: s = "aab"
 * Output: "aba"
 *
 * Example 2:
 * Input: s = "aaab"
 * Output: ""
 *
 * Example 3:
 * Input: s = "aaabc"
 * Output: "abaca"
 *
 */

public class ReorganizeStringWithPriorityQueue {

    public static void main(String[] args) {
        String str = "aaabc";
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + reorganizeString(str));
    }

    public static String reorganizeString(String s) {
        // 1. Count Character Frequencies
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // 2. Check Feasibility
        for (int count : charCounts.values()) {
            if (count > (s.length() + 1) / 2) {
                return ""; // Impossible to reorganize
            }
        }

        // 3. Prioritize Characters
        // Create a PriorityQueue to store Map.Entry objects
        // Prioritize by value on descending order.
        // Max heap based on frequency.
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
        pq.addAll(charCounts.entrySet());

        // 4. Construct the Reorganized String
        StringBuilder result = new StringBuilder();
        while (pq.size() >= 2) {
            Map.Entry<Character, Integer> entry1 = pq.poll();
            Map.Entry<Character, Integer> entry2 = pq.poll();

            result.append(entry1.getKey());
            result.append(entry2.getKey());

            entry1.setValue(entry1.getValue() - 1);
            entry2.setValue(entry2.getValue() - 1);

            if (entry1.getValue() > 0) {
                pq.add(entry1);
            }
            if (entry2.getValue() > 0) {
                pq.add(entry2);
            }
        }

        // 5. Handle Remaining Characters
        if (!pq.isEmpty()) {
            result.append(pq.poll().getKey());
        }

        // 6. Return the Result
        return result.toString();
    }
}
