package dsa;

import java.util.ArrayList;
import java.util.List;

public class GraphDFS {

    // Function to perform DFS traversal
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfsTraversal) {
        visited[node] = true; // Mark the current node as visited
        dfsTraversal.add(node); // Add the current node to the traversal list

        // Iterate through all adjacent nodes
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) { // If the neighbor has not been visited
                dfs(neighbor, adj, visited, dfsTraversal); // Recursively call DFS on the neighbor
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        List<List<Integer>> adj = new ArrayList<>(); // Adjacency list representation of the graph

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph (example: undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        GraphDFS graphDFS = new GraphDFS();
        boolean[] visited = new boolean[V]; // Array to keep track of visited nodes
        List<Integer> dfsResult = new ArrayList<>(); // List to store the DFS traversal order

        // Start DFS from node 0
        graphDFS.dfs(0, adj, visited, dfsResult);

        System.out.println("DFS Traversal: " + dfsResult); // Print the DFS traversal
    }
}