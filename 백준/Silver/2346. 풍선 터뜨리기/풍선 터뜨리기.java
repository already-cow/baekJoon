import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<int[]>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 움직일 종이의 숫자 배열
        int[] paper = new int[n];
        for (int i = 0; i < n; i++) {
            paper[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            deque.offer(new int[]{i + 1, paper[i]});
        }

        int move = paper[0];
        StringBuilder sb = new StringBuilder().append(1).append(" ");
        while (!deque.isEmpty()) {
                if (move > 0) {
                    for (int j = 1; j < move; j++) {
                        deque.offer(deque.poll());
                    }
                    int[] poll = deque.poll();
                    move = poll[1];
                    sb.append(poll[0]).append(" ");

                } else {
                    for (int j = 1; j <= -move; j++) {
                        deque.offerFirst(deque.pollLast());
                    }
                    int[] poll = deque.poll();
                    move = poll[1];
                    sb.append(poll[0]).append(" ");
                }
             }
        System.out.println(sb);
    }
}
