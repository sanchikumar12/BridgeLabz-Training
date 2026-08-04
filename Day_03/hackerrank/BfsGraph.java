package Day_03.hackerrank;
import java.io.*;
import java.util.*;

public class BfsGraph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {

            int n = sc.nextInt();
            int e = sc.nextInt();

            HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

            // Read edges
            for (int i = 0; i < e; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                graph.putIfAbsent(u, new ArrayList<>());
                graph.putIfAbsent(v, new ArrayList<>());

                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            int start = sc.nextInt();

            int[] dist = new int[n + 1];
            Arrays.fill(dist, -1);

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(start);
            dist[start] = 0;

            while (!queue.isEmpty()) {

                int node = queue.poll();

                // If the node has no neighbours, continue
                if (!graph.containsKey(node))
                    continue;

                for (int next : graph.get(node)) {

                    if (dist[next] == -1) {
                        dist[next] = dist[node] + 6;
                        queue.offer(next);
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                if (i != start)
                    System.out.print(dist[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}