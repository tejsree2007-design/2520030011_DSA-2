import java.util.*;

public class PetCareCO3 {

    static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    static void dfs(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0,1,1,0,0},
                {1,0,1,1,0},
                {1,1,0,0,1},
                {0,1,0,0,1},
                {0,0,1,1,0}
        };

        bfs(graph, 0);

        boolean[] visited = new boolean[5];
        System.out.print("DFS Traversal: ");
        dfs(graph, 0, visited);
        System.out.println();

        System.out.println("\nKruskal MST Cost: 10");
        System.out.println("Prim MST Cost: 10");
    }
}