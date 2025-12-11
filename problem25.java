import java.util.*;

class Problem25 {

    static class Graph {
        private int vertices;
        private LinkedList<Integer>[] adjList;

        // Constructor to initialize graph
        Graph(int v) {
            vertices = v;
            adjList = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        // Add an edge to the graph (undirected)
        void addEdge(int u, int v) {
            adjList[u].add(v);
            adjList[v].add(u); // comment this line for directed graph
        }

        // DFS traversal from a given source
        void DFS(int start) {
            boolean[] visited = new boolean[vertices];
            System.out.print("DFS Traversal: ");
            DFSUtil(start, visited);
            System.out.println();
        }

        // Utility method for DFS (recursive)
        void DFSUtil(int node, boolean[] visited) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        Graph g = new Graph(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            g.addEdge(u, v1);
        }

        System.out.print("Enter starting vertex for DFS: ");
        int start = sc.nextInt();

        g.DFS(start);

        sc.close();
    }
}
