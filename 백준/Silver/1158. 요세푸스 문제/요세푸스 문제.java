import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (que.size() > 1) {
            for (int j = 1; j < K; j++) {
                int a = que.poll();
                que.offer(a);
            }
            sb.append(que.poll()).append(", ");
        }

        sb.append(que.poll()).append(">");
        System.out.println(sb);
    }
}