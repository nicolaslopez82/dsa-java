package dsa;

import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
import java.util.List; // Assuming an Adjacency List representation for the graph

public class DFSExample {

    public void dfs(Graph graph, int startNode) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(startNode);
        visited.add(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            System.out.print(currentNode + " "); // Process the node

            // Get neighbors of the currentNode (assuming an adjacency list)
            List<Integer> neighbors = graph.getNeighbors(currentNode);

            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }

    // Placeholder for a Graph class with getNeighbors method
    static class Graph {
        // ... graph representation and methods
        public List<Integer> getNeighbors(int node) {
            // Return list of neighbors for the given node
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage: Create a graph and call dfs
    }
}