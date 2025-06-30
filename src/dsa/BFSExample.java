package dsa;

import java.util.*;

class BFSExample {

    // Represents the graph using an adjacency list
    static class Graph {
        private int vertices;
        private LinkedList<Integer>[] adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; ++i) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // Adds an edge to the graph
        public void addEdge(int source, int destination) {
            adjacencyList[source].add(destination);
            // For an undirected graph, add the reverse edge as well
            // adjacencyList[destination].add(source);
        }

        // Performs Breadth-First Search starting from a given source node
        public void BFS(int startNode) {
            // Mark all the vertices as not visited initially
            boolean[] visited = new boolean[vertices];
            // Create a queue for BFS
            Queue<Integer> queue = new LinkedList<>();

            // Mark the current node as visited and enqueue it
            visited[startNode] = true;
            queue.add(startNode);

            System.out.println("BFS Traversal starting from " + startNode + ":");

            while (!queue.isEmpty()) {
                // Dequeue a vertex from the queue and print it
                int currentNode = queue.poll();
                System.out.print(currentNode + " ");

                // Get all adjacent vertices of the dequeued vertex.
                // If an adjacent vertex has not been visited, mark it visited and enqueue it.
                for (int neighbor : adjacencyList[currentNode]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            System.out.println(); // New line for better formatting
        }
    }

    public static void main(String[] args) {
        // Create a graph with 6 vertices (0 to 5)
        Graph graph = new Graph(6);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        // Perform BFS starting from vertex 0
        graph.BFS(0);
    }
}
