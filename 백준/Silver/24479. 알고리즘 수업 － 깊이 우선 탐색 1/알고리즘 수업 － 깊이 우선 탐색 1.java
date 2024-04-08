import java.io.*;
import java.util.*;

public class Main {
    private static int cnt = 0;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int R = Integer.parseInt(arr[2]);

        visit = new int[N + 1];

        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            arr = br.readLine().split(" ");
            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int R) {
        visit[R] = ++cnt;

        for (int a : graph.get(R)) {
            if (visit[a] == 0) {
                dfs(a);
            }
        }
    }
}
