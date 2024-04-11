import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static boolean[][] node;
    static int N, M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        node = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            node[x][y] = true;
            node[y][x] = true;
        }
        dfs(1);
        System.out.println(count - 1);
    }

    static void dfs(int a) {
        visited[a] = true;
        count++;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && node[a][i]) {
                dfs(i);
            }
        }
    }
}