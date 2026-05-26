import java.util.ArrayList;
//bfs traversal 0(max(e+v)) or o(n) bfs is linear in nature
import java.util.*;

public class e {
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    e(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Function to perform BFS traversal from a source s
    void BFS(int s) {
        // Mark all the vertices as not visited (false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        System.out.println("BFS Traversal starting from vertex " + s + ":");

        while (queue.size() != 0) {
            // Dequeue a vertex from the queue and print it
            int curr = queue.poll();
            vis[curr]=true;
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If an adjacent vertex has not been visited,
            // then mark it as visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    // Main method to run the example
    public static void main(String args[]) {
        e graph = new e(4); // Create a graph with 4 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // Perform BFS traversal starting from vertex 2
        graph.BFS(2);
    }
}

