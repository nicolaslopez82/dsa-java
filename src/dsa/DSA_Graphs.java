package dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSA_Graphs {
    public static void main(String[] args) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        graph.put(0, new HashSet<>());
        graph.put(1, new HashSet<>());
        graph.put(2, new HashSet<>());

        graph.get(0).add(2);
        graph.get(1).add(33);
        System.out.println(graph.get(0));
        System.out.println(graph.get(1));
        System.out.println(graph.get(2));

    }
}
