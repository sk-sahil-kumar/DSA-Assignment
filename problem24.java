import java.util.*;

class Problem24 {

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

        // BFS traversal from a given source
        void BFS(int start) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[start] = true;
            queue.add(start);

            System.out.print("BFS Traversal: ");
            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");

                for (int neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            System.out.println();
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

        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();

        g.BFS(start);

        sc.close();
    }
}
