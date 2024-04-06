import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        for (int i = 0; i < T; i++) {
            if (pq.peek() == 1) {
                break;
            } else if (pq.peek() >= H) {
                int x = pq.poll() / 2;
                pq.offer(x);
                result++;
            }
        }
            if (pq.peek() >= H) {
                System.out.println("NO");
                System.out.println(pq.peek());
            } else {
                System.out.println("YES");
                System.out.println(result);
            }
    }
}